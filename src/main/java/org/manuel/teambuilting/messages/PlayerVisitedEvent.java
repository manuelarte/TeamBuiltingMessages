package org.manuel.teambuilting.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author Manuel Doncel Martos
 * @since 07/12/2016.
 */
@Data
@AllArgsConstructor
public class PlayerVisitedEvent {

    public static final String ROUTING_KEY = "player.behaviour.visited";

    @NotNull
    private final BigInteger playerId;

    private final String userId;

    @NotNull
    private final Date date;

    @JsonIgnore
    public String getRoutingKey() {
        return ROUTING_KEY;
    }

}
