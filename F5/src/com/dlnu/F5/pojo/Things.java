package com.dlnu.F5.pojo;

public class Things {
    private Integer thingsId;

    private String thingsName;

    private String thingsType;

    private String thingsSpec;

    private Integer thingsMoney;

    private Integer thingsNumber;
    
    private Integer thingsUse;

    public Things() {
		super();
	}

	public Things(String thingsName, String thingsType, String thingsSpec, Integer thingsMoney, Integer thingsNumber,
			Integer thingsUse) {
		super();
		this.thingsName = thingsName;
		this.thingsType = thingsType;
		this.thingsSpec = thingsSpec;
		this.thingsMoney = thingsMoney;
		this.thingsNumber = thingsNumber;
		this.thingsUse = thingsUse;
	}

	public Things(Integer thingsId, Integer thingsNumber, Integer thingsUse) {
		super();
		this.thingsId = thingsId;
		this.thingsNumber = thingsNumber;
		this.thingsUse = thingsUse;
	}

	public Things(Integer thingsId, String thingsName, String thingsType, String thingsSpec, Integer thingsMoney,
			Integer thingsNumber) {
		super();
		this.thingsId = thingsId;
		this.thingsName = thingsName;
		this.thingsType = thingsType;
		this.thingsSpec = thingsSpec;
		this.thingsMoney = thingsMoney;
		this.thingsNumber = thingsNumber;
	}

	public Things(Integer thingsId, String thingsName, String thingsType, String thingsSpec, Integer thingsMoney,
			Integer thingsNumber, Integer thingsUse) {
		super();
		this.thingsId = thingsId;
		this.thingsName = thingsName;
		this.thingsType = thingsType;
		this.thingsSpec = thingsSpec;
		this.thingsMoney = thingsMoney;
		this.thingsNumber = thingsNumber;
		this.thingsUse = thingsUse;
	}



	public Integer getThingsId() {
        return thingsId;
    }

    public void setThingsId(Integer thingsId) {
        this.thingsId = thingsId;
    }

    public String getThingsName() {
        return thingsName;
    }

    public void setThingsName(String thingsName) {
        this.thingsName = thingsName == null ? null : thingsName.trim();
    }

    public String getThingsType() {
        return thingsType;
    }

    public void setThingsType(String thingsType) {
        this.thingsType = thingsType == null ? null : thingsType.trim();
    }

    public String getThingsSpec() {
        return thingsSpec;
    }

    public void setThingsSpec(String thingsSpec) {
        this.thingsSpec = thingsSpec == null ? null : thingsSpec.trim();
    }

    public Integer getThingsMoney() {
        return thingsMoney;
    }

    public void setThingsMoney(Integer thingsMoney) {
        this.thingsMoney = thingsMoney;
    }

    public Integer getThingsNumber() {
        return thingsNumber;
    }

    public void setThingsNumber(Integer thingsNumber) {
        this.thingsNumber = thingsNumber;
    }

	public Integer getThingsUse() {
		return thingsUse;
	}

	public void setThingsUse(Integer thingsUse) {
		this.thingsUse = thingsUse;
	}

	@Override
	public String toString() {
		return "Things [thingsId=" + thingsId + ", thingsName=" + thingsName + ", thingsType=" + thingsType
				+ ", thingsSpec=" + thingsSpec + ", thingsMoney=" + thingsMoney + ", thingsNumber=" + thingsNumber
				+ ", thingsUse=" + thingsUse + "]";
	}

	
}