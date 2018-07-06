package cn.net.realloyal.model;

public class CarouselMap  {

	private int carouseId;

	private String carouselInstruction;

	private String carouselImgUrl;

	private String carouseLinkUrl;

	public int getCarouseId() {
		return carouseId;
	}

	public void setCarouseId(int carouseId) {
		this.carouseId = carouseId;
	}

	public String getCarouselInstruction() {
		return carouselInstruction;
	}

	public void setCarouselInstruction(String carouselInstruction) {
		this.carouselInstruction = carouselInstruction;
	}

	public String getCarouselImgUrl() {
		return carouselImgUrl;
	}

	public void setCarouselImgUrl(String carouselImgUrl) {
		this.carouselImgUrl = carouselImgUrl;
	}

	public String getCarouseLinkUrl() {
		return carouseLinkUrl;
	}

	public void setCarouseLinkUrl(String carouseLinkUrl) {
		this.carouseLinkUrl = carouseLinkUrl;
	}

	@Override
	public String toString() {
		return "CarouselMap [carouseId=" + carouseId + ", carouselInstruction=" + carouselInstruction
				+ ", carouselImgUrl=" + carouselImgUrl + ", carouseLinkUrl=" + carouseLinkUrl + "]";
	}

	public CarouselMap(int carouseId, String carouselInstruction, String carouselImgUrl, String carouseLinkUrl) {
		super();
		this.carouseId = carouseId;
		this.carouselInstruction = carouselInstruction;
		this.carouselImgUrl = carouselImgUrl;
		this.carouseLinkUrl = carouseLinkUrl;
	}

	public CarouselMap() {
		super();
	}

	
}
