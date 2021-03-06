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
 * 结合poi和jfreechart创建图表图片
 * 
 * @author tuzongxun
 * @date 2016年9月19日 上午10:55:09
 */
public class excelutil {
    public static void main(String[] args) throws Exception {
        // excel2003工作表
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("不良明细");
        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
        ;
        CellRangeAddress cellrange=new CellRangeAddress(0, 0, 0,1);
        // 设置具体数据
        List<String> timeList = new ArrayList<String>();
        timeList.add("缺件");
        timeList.add("断路");
        timeList.add("短路");
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
        row.createCell(0).setCellValue("不良明细");
        row.getCell(0).setCellStyle(cellStyle);
        sheet.addMergedRegion(cellrange);
        RegionUtil.setBorderBottom(1, cellrange, sheet,wb);
        RegionUtil.setBorderTop(1, cellrange, sheet,wb);
        RegionUtil.setBorderLeft(1, cellrange, sheet,wb);
        RegionUtil.setBorderRight(1, cellrange, sheet,wb);
        HSSFRow row2=sheet.createRow(1);
        row2.createCell(0).setCellStyle(cellStyle);
        row2.getCell(0).setCellValue("现象");
        row2.createCell(1).setCellStyle(cellStyle);
        row2.getCell(1).setCellValue("数量");
        for (int i = 0; i < timeList.size(); i++) {
			HSSFRow row3=sheet.createRow(i+2);
			HSSFCell cell=row3.createCell(0);
			HSSFCell cell2=row3.createCell(1);
			cell.setCellStyle(cellStyle);
			cell2.setCellStyle(cellStyle);
			cell.setCellValue(timeList.get(i));
			cell2.setCellValue(appList.get(i));
			
		}
        
        // 设置图片中的字体和颜色以及字号
        Font titleFont = new Font("黑体", Font.BOLD, 12);
        Font xfont = new Font("黑体", Font.BOLD, 10);
        Font labelFont = new Font("黑体", Font.BOLD, 10);
        // 设置数据区域
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < timeList.size(); i++) {
            String time = timeList.get(i);
            dataset.addValue(appList.get(i), "飞龙", time);
        }
        JFreeChart chart = ChartFactory.createBarChart("不良明细", "不良现象", "数量", dataset, PlotOrientation.VERTICAL, true,
            true, true);
        // 设置图例字体
        chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 10));
        // 设置标题字体
        chart.setTitle(new TextTitle(chart.getTitle().getText(), titleFont));
        // 图形的绘制结构对象
        CategoryPlot plot = chart.getCategoryPlot();
//        // 获取显示线条的对象
//        CategoryItemRenderer	lasp =plot.getRenderer();
//        lasp.setBaseItemLabelsVisible(true);
//        lasp.setBaseItemLabelPaint(ChartColor.RED);
//        // 设置网格线
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
        // x轴
        CategoryAxis domainAxis = plot.getDomainAxis();
        // 设置x轴不显示，即让x轴和数据区重合
        domainAxis.setAxisLineVisible(false);
        // x轴标题
        domainAxis.setLabelFont(xfont);
        // x轴数据倾斜
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(0.95D));
        // X轴坐标上数值字体
        domainAxis.setTickLabelFont(labelFont);
        // 设置Y轴间隔
        NumberAxis numAxis = (NumberAxis) plot.getRangeAxis();
        numAxis.setTickUnit(new NumberTickUnit(50));
        // y轴
        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setLabelFont(xfont);
        // 设置y轴不显示，即和数据区重合
        rangeAxis.setAxisLineVisible(false);
        // y轴坐标上数值字体
        rangeAxis.setTickLabelFont(labelFont);
        rangeAxis.setFixedDimension(0);
        CategoryPlot cp = chart.getCategoryPlot();
        // 背景色设置
        cp.setBackgroundPaint(ChartColor.WHITE);
        cp.setRangeGridlinePaint(ChartColor.GRAY);
        // 创建图例，设置图例的位置，这里的设置实际不起作用，怎么设都在下边
        LegendTitle legendTitle = new LegendTitle(chart.getPlot());
        legendTitle.setPosition(RectangleEdge.BOTTOM);
        try {
            ChartUtilities.writeChartAsPNG(byteArrayOut, chart, 400, 200);
            String fileSavePath = "exTest.png";
            BufferedImage bufferImg = ImageIO.read(new File(fileSavePath));
            ImageIO.write(bufferImg, "png", byteArrayOut);
        } catch (IOException e) {
        }
        // 画图的顶级管理器，一个sheet只能获取一个（一定要注意这点）
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
        // 八个参数，前四个表示图片离起始单元格和结束单元格边缘的位置，
        // 后四个表示起始和结束单元格的位置，如下表示从第2列到第12列，从第1行到第15行,需要注意excel起始位置是0
        HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0, (short) 2, (short) 1, (short) 12, (short) 15);
        anchor.setAnchorType(3);
        // 插入图片
        patriarch.createPicture(anchor, wb.addPicture(byteArrayOut.toByteArray(), HSSFWorkbook.PICTURE_TYPE_PNG));
        // excel2003后缀
        FileOutputStream fileOut = new FileOutputStream("exTest.xls");
        wb.write(fileOut);
        fileOut.close();
    }
}