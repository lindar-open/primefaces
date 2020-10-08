/*
 * The MIT License
 *
 * Copyright (c) 2009-2020 PrimeTek
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.primefaces.model.datepicker;

import java.io.Serializable;

public class DefaultDateMetaData implements DateMetaData, Serializable {

    private static final long serialVersionUID = 1L;

    private boolean disabled;

    public DefaultDateMetaData() {
    }

    @Override
    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.disabled ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DefaultDateMetaData other = (DefaultDateMetaData) obj;
        return this.disabled == other.disabled;
    }

    @Override
    public String toString() {
        return "DefaultDateMetaData{" + "disabled=" + disabled + '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private final DefaultDateMetaData dateMetaData;

        private Builder() {
            dateMetaData = new DefaultDateMetaData();
        }

        public Builder disabled(boolean disabled) {
            dateMetaData.setDisabled(disabled);
            return this;
        }

        public DefaultDateMetaData build() {
            return dateMetaData;
        }
    }
}
