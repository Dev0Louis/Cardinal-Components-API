/*
 * Cardinal-Components-API
 * Copyright (C) 2019-2024 Ladysnake
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.ladysnake.cca.api.v3.component;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Contract;

/**
 * The base interface for components.
 *
 * @since 2.7.0
 */
public interface Component {

    /**
     * Reads this component's properties from a {@link NbtCompound}.
     *
     * @param tag            a {@code NbtCompound} on which this component's serializable data has been written
     * @param registryLookup access to dynamic registry data
     * @implNote implementations should not assert that the data written on the tag corresponds to any
     * specific scheme, as saved data is susceptible to external tempering, and may come from an earlier
     * version.
     */
    @Contract(mutates = "this")
    void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup);

    /**
     * Writes this component's properties to a {@link NbtCompound}.
     *
     * @param tag            a {@code NbtCompound} on which to write this component's serializable data
     * @param registryLookup access to dynamic registry data
     */
    @Contract(mutates = "param1")
    void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup);
}
