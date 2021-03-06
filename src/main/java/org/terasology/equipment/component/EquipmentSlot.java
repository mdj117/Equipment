/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.equipment.component;

import com.google.common.collect.Lists;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.reflection.MappedContainer;

import java.util.List;

/**
 * This component represents a single equipment slot, and contains the slot's attributes.
 */
@MappedContainer
public class EquipmentSlot {
    // * Associated Anatomy part (optional)
    public String name;
    public String type;
    public EntityRef itemRef = EntityRef.NULL;
    public int numSlotsOfSameType = 1;
    public List<EntityRef> itemRefs = Lists.newArrayList();
}
