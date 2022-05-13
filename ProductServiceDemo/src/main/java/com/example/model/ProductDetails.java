package com.example.model;

public class ProductDetails {
	private String pName;
	private String pImage;
	private String pThumbnail;
	private String PDescription;
	private String pDecription;
	private Double pRatings;
	private Double pPrice;
	private Boolean isActive;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpImage() {
		return pImage;
	}
	public void setpImage(String pImage) {
		this.pImage = pImage;
	}
	public String getpThumbnail() {
		return pThumbnail;
	}
	public void setpThumbnail(String pThumbnail) {
		this.pThumbnail = pThumbnail;
	}
	public String getPDescription() {
		return PDescription;
	}
	public void setPDescription(String pDescription) {
		PDescription = pDescription;
	}
	public String getpDecription() {
		return pDecription;
	}
	public void setpDecription(String pDecription) {
		this.pDecription = pDecription;
	}
	public Double getpRatings() {
		return pRatings;
	}
	public void setpRatings(Double pRatings) {
		this.pRatings = pRatings;
	}
	public Double getpPrice() {
		return pPrice;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "ProductDetails [pName=" + pName + ", pImage=" + pImage + ", pThumbnail=" + pThumbnail
				+ ", PDescription=" + PDescription + ", pDecription=" + pDecription + ", pRatings=" + pRatings
				+ ", pPrice=" + pPrice + ", isActive=" + isActive + "]";
	}
	
	


}
