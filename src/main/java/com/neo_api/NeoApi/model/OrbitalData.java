package com.neo_api.NeoApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrbitalData {
    @JsonProperty("orbit_id")
    private String orbit_id;
    @JsonProperty("orbit_determination_date")
    private String orbitDeterminationDate;
    @JsonProperty("last_observation_date")
    private String lastObservationDate;
    @JsonProperty("data_arc_in_days")
    private String dataArcInDays;
    @JsonProperty("orbit_uncertainty")
    private String orbitUncertainty;
    @JsonProperty("minimum_orbit_intersection")
    private String minimumOrbitIntersection;
    @JsonProperty("jupiter_tisserand_invariant")
    private String jupiterTisserandInvariant;
    @JsonProperty("epoch_osculation")
    private String epochOsculation;
    @JsonProperty("eccentricity")
    private String eccentricity;
    @JsonProperty("semi_major_axis")
    private String semiMajorAxis;
    @JsonProperty("inclination")
    private String inclination;
    @JsonProperty("ascending_node_longitude")
    private String ascNodeLong;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    @JsonProperty("perihelion_distance")
    private String perihelionDistance;
    @JsonProperty("perihelion_argument")
    private String perihelion_argument;
    @JsonProperty("aphelion_distance")
    private String aphelion_distance;
    @JsonProperty("perihelion_time")
    private String perihelion_time;
    @JsonProperty("mean_anomaly")
    private String meanAnomaly;
    @JsonProperty("mean_motion")
    private String meanMoion;
    private String equinox;
    @JsonProperty("orbit_class")
    private OrbitClass orbitClass;

    public String getOrbit_id() {
        return orbit_id;
    }

    public void setOrbit_id(String orbit_id) {
        this.orbit_id = orbit_id;
    }

    public String getOrbitDeterminationDate() {
        return orbitDeterminationDate;
    }

    public void setOrbitDeterminationDate(String orbitDeterminationDate) {
        this.orbitDeterminationDate = orbitDeterminationDate;
    }

    public String getLastObservationDate() {
        return lastObservationDate;
    }

    public void setLastObservationDate(String lastObservationDate) {
        this.lastObservationDate = lastObservationDate;
    }

    public String getDataArcInDays() {
        return dataArcInDays;
    }

    public void setDataArcInDays(String dataArcInDays) {
        this.dataArcInDays = dataArcInDays;
    }

    public String getOrbitUncertainty() {
        return orbitUncertainty;
    }

    public void setOrbitUncertainty(String orbitUncertainty) {
        this.orbitUncertainty = orbitUncertainty;
    }

    public String getMinimumOrbitIntersection() {
        return minimumOrbitIntersection;
    }

    public void setMinimumOrbitIntersection(String minimumOrbitIntersection) {
        this.minimumOrbitIntersection = minimumOrbitIntersection;
    }

    public String getJupiterTisserandInvariant() {
        return jupiterTisserandInvariant;
    }

    public void setJupiterTisserandInvariant(String jupiterTisserandInvariant) {
        this.jupiterTisserandInvariant = jupiterTisserandInvariant;
    }

    public String getEpochOsculation() {
        return epochOsculation;
    }

    public void setEpochOsculation(String epochOsculation) {
        this.epochOsculation = epochOsculation;
    }

    public String getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    public String getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(String semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public String getInclination() {
        return inclination;
    }

    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    public String getAscNodeLong() {
        return ascNodeLong;
    }

    public void setAscNodeLong(String ascNodeLong) {
        this.ascNodeLong = ascNodeLong;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getPerihelionDistance() {
        return perihelionDistance;
    }

    public void setPerihelionDistance(String perihelionDistance) {
        this.perihelionDistance = perihelionDistance;
    }

    public String getPerihelion_argument() {
        return perihelion_argument;
    }

    public void setPerihelion_argument(String perihelion_argument) {
        this.perihelion_argument = perihelion_argument;
    }

    public String getAphelion_distance() {
        return aphelion_distance;
    }

    public void setAphelion_distance(String aphelion_distance) {
        this.aphelion_distance = aphelion_distance;
    }

    public String getPerihelion_time() {
        return perihelion_time;
    }

    public void setPerihelion_time(String perihelion_time) {
        this.perihelion_time = perihelion_time;
    }

    public String getMeanAnomaly() {
        return meanAnomaly;
    }

    public void setMeanAnomaly(String meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    public String getMeanMoion() {
        return meanMoion;
    }

    public void setMeanMoion(String meanMoion) {
        this.meanMoion = meanMoion;
    }

    public String getEquinox() {
        return equinox;
    }

    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }

    public OrbitClass getOrbitClass() {
        return orbitClass;
    }

    public void setOrbitClass(OrbitClass orbitClass) {
        this.orbitClass = orbitClass;
    }

    @Override
    public String toString() {
        return "OrbitalData{" +
                "orbit_id='" + orbit_id + '\'' +
                ", orbitDeterminationDate='" + orbitDeterminationDate + '\'' +
                ", lastObservationDate='" + lastObservationDate + '\'' +
                ", dataArcInDays='" + dataArcInDays + '\'' +
                ", orbitUncertainty='" + orbitUncertainty + '\'' +
                ", minimumOrbitIntersection='" + minimumOrbitIntersection + '\'' +
                ", jupiterTisserandInvariant='" + jupiterTisserandInvariant + '\'' +
                ", epochOsculation='" + epochOsculation + '\'' +
                ", eccentricity='" + eccentricity + '\'' +
                ", semiMajorAxis='" + semiMajorAxis + '\'' +
                ", inclination='" + inclination + '\'' +
                ", ascNodeLong='" + ascNodeLong + '\'' +
                ", orbitalPeriod='" + orbitalPeriod + '\'' +
                ", perihelionDistance='" + perihelionDistance + '\'' +
                ", perihelion_argument='" + perihelion_argument + '\'' +
                ", aphelion_distance='" + aphelion_distance + '\'' +
                ", perihelion_time='" + perihelion_time + '\'' +
                ", meanAnomaly='" + meanAnomaly + '\'' +
                ", meanMoion='" + meanMoion + '\'' +
                ", equinox='" + equinox + '\'' +
                ", orbitClass=" + orbitClass +
                '}';
    }
}