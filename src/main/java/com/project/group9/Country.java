package com.project.group9;

public class Country {
    /**
     * country code
     */
    private String Code;

    /**
     *Country Name
     */
    private String Name;

    /**
     * Country Continent
     */
    private String Continent;

    /**
     * Region
     */
    private String Region;

    /**
     * SurfaceArea
     */
    private Float SurfaceArea;

    /**
     * IndepYear
     */
    private Integer IndepYear;

    /**
     * Population
     */
    private Integer Population;

    /**
     * LifeExpectancy
     */
    private Float LifeExpectancy;

    /**
     * GNP
     */
    private Float GNP;

    /**
     * GNPOld
     */
    private Float GNPOld;

    /**
     * LocalName
     */
    private String LocalName;

    /**
     * GovernmentForm
     */
    private String GovernmentForm;

    /**
     * HeadOfState
     */
    private String HeadOfState;

    /**
     * Capital (with both string and integer)
     */
    private Integer Capital;
    private String Capitali;

    /**
     * Code2
     */
    private String Code2;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(final String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(final String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(final String region) {
        Region = region;
    }

    public Float getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(final Float surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(final Integer indepYear) {
        IndepYear = indepYear;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(final Integer population) {
        Population = population;
    }

    public Float getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(final Float lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public Float getGNP() {
        return GNP;
    }

    public void setGNP(final Float GNP) {
        this.GNP = GNP;
    }

    public Float getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(final Float GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(final String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(final String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(final String headOfState) {
        HeadOfState = headOfState;
    }

    public Integer getCapital() {
        return Capital;
    }

    public void setCapital(final Integer capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(final String code2) {
        Code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2='" + Code2 + '\'' +
                '}';
    }

    public String getCapitali() {
        return Capitali;
    }

    public void setCapitali(final String capitali) {
        Capitali = capitali;
    }

    public Country() {
    }
}
