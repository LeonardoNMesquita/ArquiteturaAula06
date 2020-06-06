package javabeans;

import java.util.Arrays;

public class Populares {
	private int page;
	private Object[] results;
	private int total_results;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Object[] getResults() {
		return results;
	}
	public void setResults(Object[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Populares [page=" + page + ", results=" + Arrays.toString(results) + ", total_results=" + total_results
				+ ", total_pages=" + total_pages + "]";
	}
	public int getTotal_results() {
		return total_results;
	}
	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	private int total_pages;

}
