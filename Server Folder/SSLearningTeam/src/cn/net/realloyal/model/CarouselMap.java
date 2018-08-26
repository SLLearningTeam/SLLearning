package cn.net.realloyal.model;

public class CarouselMap  {

	private int carouselId;

	private String carouselInstruction;

	private String carouselImgUrl;

	private String carouselLinkUrl;

	public int getCarouselId() {
		return carouselId;
	}

	public void setCarouselId(int carouselId) {
		this.carouselId = carouselId;
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

	public String getCarouselLinkUrl() {
		return carouselLinkUrl;
	}

	public void setCarouselLinkUrl(String carouselLinkUrl) {
		this.carouselLinkUrl = carouselLinkUrl;
	}

	@Override
	public String toString() {
		return "CarouselMap [carouselId=" + carouselId + ", carouselInstruction=" + carouselInstruction
				+ ", carouselImgUrl=" + carouselImgUrl + ", carouselLinkUrl=" + carouselLinkUrl + "]";
	}

	public CarouselMap(int carouselId, String carouselInstruction, String carouselImgUrl, String carouselLinkUrl) {
		super();
		this.carouselId = carouselId;
		this.carouselInstruction = carouselInstruction;
		this.carouselImgUrl = carouselImgUrl;
		this.carouselLinkUrl = carouselLinkUrl;
	}

	public CarouselMap() {
		super();
	}

	
	
}
