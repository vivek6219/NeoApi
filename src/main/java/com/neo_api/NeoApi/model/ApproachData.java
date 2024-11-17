package com.neo_api.NeoApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApproachData {
    @JsonProperty("close_approach_date")
    private String approachDate;
    @JsonProperty("close_approach_date_full")
    private String approachDateFull;
    @JsonProperty("epoch_date_close_approach")
    private String epochDateApproach;
    @JsonProperty("relative_velocity")
    private RelativeVelocity relativeVelocity;
    @JsonProperty("miss_distance")
    private MissDistance missDistance;
    private String orbiting_body;

}
