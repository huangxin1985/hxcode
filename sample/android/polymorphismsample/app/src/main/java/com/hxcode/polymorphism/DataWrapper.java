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
import android.os.Parcelable;

public class DataWrapper implements Parcelable {

    private RootData rootData;

    public RootData getRootData() {
        return rootData;
    }

    public void setRootData(RootData rootData) {
        this.rootData = rootData;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.rootData, flags);
    }

    public DataWrapper() {
    }

    protected DataWrapper(Parcel in) {
        this.rootData = in.readParcelable(RootData.class.getClassLoader());
    }

    public static final Creator<DataWrapper> CREATOR = new Creator<DataWrapper>() {
        @Override
        public DataWrapper createFromParcel(Parcel source) {
            return new DataWrapper(source);
        }

        @Override
        public DataWrapper[] newArray(int size) {
            return new DataWrapper[size];
        }
    };
}
