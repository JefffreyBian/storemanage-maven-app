package com.store.util;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 杩欓噷鏄�熼壌缃戜笂鐨勪緥瀛愶紝鍏蜂綋鍑哄蹇樹簡銆傚鍘熶綔鑰呰〃绀烘姳姝夈��
 * 杩欎釜绫讳富瑕佹槸灏佽浆鏈夊叧鍒嗛�?�鐨勭浉鍏虫搷浣滐紝姣斿涓嬩竴椤碉紝涓婁竴椤碉紝鏈�鍚庝竴椤碉紝棣栭�??
 * 鍦ㄦdemo涓紝鍙敤鍒版敼绫讳腑鐨勮绠楅�?�鏁扮殑鐩稿叧鎿嶄綔锛岃嚦浜庝笅涓�椤点�佷笂涓�椤电瓑鎿嶄綔锛孧yPagination宸茬粡甯垜浠皝杞�?ソ浜嗗晩锛�
 * @author Administrator
 *
 */

@XmlRootElement
public class Page<T> {
	private int totalRow;	//鎬诲叡璁板綍鏁�
	private int totalPage;	//鎬诲叡椤垫暟
	private int currentPage = 1; //褰撳墠椤碉紝榛樿涓�?1
	private int pageSize = 50;   //椤电殑澶у�?
	private boolean hasPrevious; //鏄惁鏈変笂涓�椤�
	private boolean hasNext; //鏄惁鏈変笅涓�椤�
	private boolean bof;  //鏄惁鏄椤�
	private boolean eof;  //鏄惁鏄熬椤�
	private List<T> list; // 褰撳墠椤电殑鏁版嵁淇℃伅
	private Page<T> page; // 褰撳墠椤电殑淇℃�?
	
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Page<T> getPage() {
		return page;
	}
	public void setPage(Page<T> page) {
		this.page = page;
	}
    public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage=totalPage;
	}
	public int getCurrentPage() {

		return this.currentPage;
	}
	
	public boolean isHasPrevious() {
		return hasPrevious;
	}
	public boolean isHasNext() {
		return hasNext;
	}
	public boolean isBof() {
		return bof;
	}
	public boolean isEof() {
		return eof;
	}
	public boolean hasNext() {
		return currentPage < this.totalPage;
	}
	public boolean hasPrevious() {
		return currentPage > 1;
	}
	public boolean isFirst() {
		return currentPage == 1;
	}
	public boolean isLast() {
		return currentPage >= this.totalPage;
	}
	
	// 鑾峰彇鍒嗛�?�澶у�?
	public int getPageSize() {
		return pageSize;
	}
	// 璁剧疆鍒嗛�?�澶у�?
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	/*
	 * 鏋勯�犳柟娉�?
     */
	public Page(){
		
	}
	
	
	
	/*
	 * 鏋勯�犳柟娉�?
	   @param totalRow 鎬昏褰曟暟
	   @param pageSize 椤电殑澶у�?
	   @param page 椤电�?
     */
	public Page(int totalRow, int pageSize, int page) {
		this.totalRow = totalRow;
		this.pageSize = pageSize;
		// 鏍规嵁椤靛ぇ灏忓拰鎬昏褰曟暟璁＄畻鍑烘�婚〉鏁�?
		this.totalPage = countTotalPage(this.pageSize, this.totalRow);
		// 淇褰撳墠椤�
		setCurrentPage(page);
		init();
	}
	
	// 鍒濆鍖栦俊鎭�
	private void init() {

		this.hasNext = hasNext();

		this.hasPrevious = hasPrevious();

		this.bof = isFirst();

		this.eof = isLast();

	}
	
	// 淇璁＄畻褰撳墠椤�?
	public void setCurrentPage(int currentPage) {
        if(currentPage>this.totalPage){
        	this.currentPage=this.totalPage;        	
        }else if (currentPage<1){
        	this.currentPage=1;
        }
        else{
        	this.currentPage=currentPage;
        }
	}
	
	// 鑾峰彇褰撳墠椤佃褰曠殑寮�濮嬬储寮�?
	public int getBeginIndex() {
		int beginIndex = (currentPage - 1) * pageSize; // 绱㈠紩涓嬫爣浠�0寮�濮�
		return beginIndex;
	}
	
	// 璁＄畻鎬婚�?�鏁�?
	public int countTotalPage(int pageSize, int totalRow) {
		int totalPage = totalRow % pageSize == 0 ? totalRow / pageSize : totalRow / pageSize + 1;
		return totalPage;
	}
	
	// 杩斿洖涓嬩竴椤电殑椤电爜
	public int getNextPage() {
		if (currentPage + 1 >= this.totalPage) { // 濡傛灉褰撳墠椤靛凡缁忔槸鏈�鍚庨�? 鍒欒繑鍥炴渶澶ч�??
			return this.totalPage;
		}
		return currentPage + 1; 
	}
	
	
	// 杩斿洖鍓嶄竴椤电殑椤电爜
	public int getPreviousPage() {
		if (currentPage - 1 <= 1) {
			return 1;
		} else {
			return currentPage - 1;
		}
	}
	
}
