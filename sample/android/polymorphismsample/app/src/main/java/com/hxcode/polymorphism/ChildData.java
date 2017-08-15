package com.hxcode.polymorphism;
/**
 * Copyright [Harris.Huang] [huangxin1985@gmail.com]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import android.os.Parcel;

public class ChildData extends RootData {
    int childData;

    public int getChildData() {
        return childData;
    }

    public void setChildData(int childData) {
        this.childData = childData;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.childData);
    }

    public ChildData() {
        super();
    }

    protected ChildData(Parcel in) {
        super(in);
        this.childData = in.readInt();

    }

    public static final Creator<ChildData> CREATOR = new Creator<ChildData>() {
        public ChildData createFromParcel(Parcel in) {
            return new ChildData(in);
        }

        public ChildData[] newArray(int size) {
            return new ChildData[size];
        }
    };
}
