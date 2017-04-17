package org.manuel.teambuilting.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Manuel Doncel Martos
 * @since 11/01/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(builder = TeamDeletedEvent.TeamDeletedEventBuilder.class)
@Data
@AllArgsConstructor
public class TeamDeletedEvent {

    public static final String ROUTING_KEY = "team.deleted";

    @NotNull
    private final String teamId;

    private final String userId;

    @NotNull
    private final Date date;

    @JsonIgnore
    public String getRoutingKey() {
        return ROUTING_KEY;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class TeamDeletedEventBuilder {
    }
}
