package com.sprintinaction.tacocloud.data;

import com.sprintinaction.tacocloud.models.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
