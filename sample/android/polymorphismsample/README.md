# [Sample Code] Use parcelable to pass the complex object

        If someone want to use parcelable to pass the  polymorphism object from
        client to server. you can use this sample to implement.
        如果有人希望通过parcelable实现客户端和服务器端的多态对象的传送，可以借鉴这个例子。
        实现的原理是通过抽象parcelable的父类+数据Wrapper实现对象的多态传输。


