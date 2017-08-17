package com.store.util;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleEdge;

/**
 * ���poi��jfreechart����ͼ��ͼƬ
 * 
 * @author tuzongxun
 * @date 2016��9��19�� ����10:55:09
 */
public class excelutil {
    public static void main(String[] args) throws Exception {
        // excel2003������
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("������ϸ");
        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
        ;
        CellRangeAddress cellrange=new CellRangeAddress(0, 0, 0,1);
        // ���þ�������
        List<String> timeList = new ArrayList<String>();
        timeList.add("ȱ��");
        timeList.add("��·");
        timeList.add("��·");
        List<Integer> appList = new ArrayList<Integer>();
        HSSFCellStyle cellStyle=wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
        cellStyle.setBorderTop(CellStyle.BORDER_THIN);
        cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
        cellStyle.setBorderRight(CellStyle.BORDER_THIN);
        appList.add(500);
        appList.add(100);
        appList.add(20);
        HSSFRow row=sheet.createRow(0);
        row.createCell(0).setCellValue("������ϸ");
        row.getCell(0).setCellStyle(cellStyle);
        sheet.addMergedRegion(cellrange);
        RegionUtil.setBorderBottom(1, cellrange, sheet,wb);
        RegionUtil.setBorderTop(1, cellrange, sheet,wb);
        RegionUtil.setBorderLeft(1, cellrange, sheet,wb);
        RegionUtil.setBorderRight(1, cellrange, sheet,wb);
        HSSFRow row2=sheet.createRow(1);
        row2.createCell(0).setCellStyle(cellStyle);
        row2.getCell(0).setCellValue("����");
        row2.createCell(1).setCellStyle(cellStyle);
        row2.getCell(1).setCellValue("����");
        for (int i = 0; i < timeList.size(); i++) {
			HSSFRow row3=sheet.createRow(i+2);
			HSSFCell cell=row3.createCell(0);
			HSSFCell cell2=row3.createCell(1);
			cell.setCellStyle(cellStyle);
			cell2.setCellStyle(cellStyle);
			cell.setCellValue(timeList.get(i));
			cell2.setCellValue(appList.get(i));
			
		}
        
        // ����ͼƬ�е��������ɫ�Լ��ֺ�
        Font titleFont = new Font("����", Font.BOLD, 12);
        Font xfont = new Font("����", Font.BOLD, 10);
        Font labelFont = new Font("����", Font.BOLD, 10);
        // ������������
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < timeList.size(); i++) {
            String time = timeList.get(i);
            dataset.addValue(appList.get(i), "����", time);
        }
        JFreeChart chart = ChartFactory.createBarChart("������ϸ", "��������", "����", dataset, PlotOrientation.VERTICAL, true,
            true, true);
        // ����ͼ������
        chart.getLegend().setItemFont(new Font("����", Font.BOLD, 10));
        // ���ñ�������
        chart.setTitle(new TextTitle(chart.getTitle().getText(), titleFont));
        // ͼ�εĻ��ƽṹ����
        CategoryPlot plot = chart.getCategoryPlot();
//        // ��ȡ��ʾ�����Ķ���
//        CategoryItemRenderer	lasp =plot.getRenderer();
//        lasp.setBaseItemLabelsVisible(true);
//        lasp.setBaseItemLabelPaint(ChartColor.RED);
//        // ����������
//        plot.setDomainGridlinePaint(Color.gray);
//        plot.setDomainGridlinesVisible(true);
//        plot.setRangeGridlinePaint(Color.gray);
//        plot.setRangeGridlinesVisible(true);
        BarRenderer renderer=new BarRenderer();
        renderer.setBaseItemLabelsVisible(true);
        renderer.setBaseFillPaint(ChartColor.DARK_GREEN);
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setItemLabelPaint(ChartColor.RED);
        plot.setRenderer(renderer);
        // x��
        CategoryAxis domainAxis = plot.getDomainAxis();
        // ����x�᲻��ʾ������x����������غ�
        domainAxis.setAxisLineVisible(false);
        // x�����
        domainAxis.setLabelFont(xfont);
        // x��������б
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(0.95D));
        // X����������ֵ����
        domainAxis.setTickLabelFont(labelFont);
        // ����Y����
        NumberAxis numAxis = (NumberAxis) plot.getRangeAxis();
        numAxis.setTickUnit(new NumberTickUnit(50));
        // y��
        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setLabelFont(xfont);
        // ����y�᲻��ʾ�������������غ�
        rangeAxis.setAxisLineVisible(false);
        // y����������ֵ����
        rangeAxis.setTickLabelFont(labelFont);
        rangeAxis.setFixedDimension(0);
        CategoryPlot cp = chart.getCategoryPlot();
        // ����ɫ����
        cp.setBackgroundPaint(ChartColor.WHITE);
        cp.setRangeGridlinePaint(ChartColor.GRAY);
        // ����ͼ��������ͼ����λ�ã����������ʵ�ʲ������ã���ô�趼���±�
        LegendTitle legendTitle = new LegendTitle(chart.getPlot());
        legendTitle.setPosition(RectangleEdge.BOTTOM);
        try {
            ChartUtilities.writeChartAsPNG(byteArrayOut, chart, 400, 200);
            String fileSavePath = "exTest.png";
            BufferedImage bufferImg = ImageIO.read(new File(fileSavePath));
            ImageIO.write(bufferImg, "png", byteArrayOut);
        } catch (IOException e) {
        }
        // ��ͼ�Ķ�����������һ��sheetֻ�ܻ�ȡһ����һ��Ҫע����㣩
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
        // �˸�������ǰ�ĸ���ʾͼƬ����ʼ��Ԫ��ͽ�����Ԫ���Ե��λ�ã�
        // ���ĸ���ʾ��ʼ�ͽ�����Ԫ���λ�ã����±�ʾ�ӵ�2�е���12�У��ӵ�1�е���15��,��Ҫע��excel��ʼλ����0
        HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0, (short) 2, (short) 1, (short) 12, (short) 15);
        anchor.setAnchorType(3);
        // ����ͼƬ
        patriarch.createPicture(anchor, wb.addPicture(byteArrayOut.toByteArray(), HSSFWorkbook.PICTURE_TYPE_PNG));
        // excel2003��׺
        FileOutputStream fileOut = new FileOutputStream("exTest.xls");
        wb.write(fileOut);
        fileOut.close();
    }
}