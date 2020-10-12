package com.gao.array;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ArrayDemo01 {
    //变量的类型  变量的名字 = 变量的值
    //数组类型
    public static void main(String[] args) {
        int[] nums;//1.定义 什么一个数组
//        int nums2[]; //C和C++用的 java不用

        nums = new int[10];//这里可以存放10歌int类型的数字   创建一个数组
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        //没创建空间时 默认为0
        System.out.println(nums[3]);

        int[] nums2; //没new时在栈里面
        nums2 = new int[3]; //new后 在堆中创建一个空间,空间中装3个下标的空间
        //给数组元素赋值,如果没有赋值的元素打印会报错,越界
        nums2[0] = 1;
        nums2[1] = 2;

        System.out.println(nums2[0]);
//        System.out.println(nums2[3]); //由于new int[3]只创建了0,1,2三个的下表如果没有赋值的元素打印会报错,越界

        String[] a;
        a =new String[10];
        a[0]="{\"sdt\":\"{\\\"serchName\\\":\\\"0\\\",\\\"serchDetail\\\":\\\"\\\",\\\"spuName\\\":\\\"\\\",\\\"abnorOrder\\\":\\\"\\\",\\\"developPersonId\\\":\\\"\\\",\\\"userSource\\\":[],\\\"mobile\\\":\\\"\\\",\\\"orderId\\\":\\\"\\\",\\\"orderStaus\\\":\\\"ORDER_PAY\\\",\\\"hallId\\\":\\\"\\\",\\\"beginTime\\\":\\\"2020-08-20\\\",\\\"endTime\\\":\\\"2020-09-19\\\",\\\"onSiteCard\\\":\\\"\\\",\\\"payType\\\":[],\\\"orderType\\\":[],\\\"userType\\\":\\\"\\\",\\\"page\\\":1,\\\"pageSize\\\":10}\"}";
        a[1]="{\"sdt\":\"{\\\"serchName\\\":\\\"0\\\",\\\"serchDetail\\\":\\\"\\\",\\\"spuName\\\":\\\"\\\",\\\"abnorOrder\\\":\\\"\\\",\\\"developPersonId\\\":\\\"\\\",\\\"userSource\\\":[],\\\"mobile\\\":\\\"\\\",\\\"orderId\\\":\\\"\\\",\\\"orderStaus\\\":\\\"ORDER_PAY\\\",\\\"hallId\\\":\\\"\\\",\\\"beginTime\\\":\\\"2020-08-20\\\",\\\"endTime\\\":\\\"2020-09-19\\\",\\\"onSiteCard\\\":\\\"\\\",\\\"payType\\\":[],\\\"orderType\\\":[],\\\"userType\\\":\\\"\\\",\\\"page\\\":1,\\\"pageSize\\\":10}\"}";
        String goff="{\"skus\": [{\n" +
                "\t\"limitNum\": 99999,\n" +
                "\t\"pro2348137327\": \"128GB\",\n" +
                "\t\"skuPrice\": 589900,\n" +
                "\t\"skuStock\": 0,\n" +
                "\t\"skuShopid\": \"1\",\n" +
                "\t\"skuType\": \"LJ\",\n" +
                "\t\"skuSaleNum\": 0,\n" +
                "\t\"skuName\": \"华为 Mate30 Pro 5G 128GB 青山黛\",\n" +
                "\t\"skuPreprice\": 589900,\n" +
                "\t\"minLimitNum\": 1,\n" +
                "\t\"orderSystemSku\": \"596905010020200103169892\",\n" +
                "\t\"skuSpuId\": \"20200917152739403855573\",\n" +
                "\t\"pro3906833394\": \"青山黛\",\n" +
                "\t\"skuId\": \"20200918144437278890453\",\n" +
                "\t\"skuImgurl\": \"https://smarthome.17wo.cn/fileresources-server/hyzd/20190425174518271947051/d3ac3f77bcb141508a63a3d3d5f02f7f.png\"\n" +
                "},\n" +
                "             {\n" +
                "\t\"limitNum\": 99999,\n" +
                "\t\"pro2348137327\": \"128GB\",\n" +
                "\t\"skuPrice\": 559900,\n" +
                "\t\"skuStock\": 0,\n" +
                "\t\"skuShopid\": \"1\",\n" +
                "\t\"skuType\": \"LJ\",\n" +
                "\t\"skuSaleNum\": 0,\n" +
                "\t\"skuName\": \"【优惠】华为 Mate30 Pro 5G 128GB 亮黑色\",\n" +
                "\t\"skuPreprice\": 559900,\n" +
                "\t\"minLimitNum\": 1,\n" +
                "\t\"orderSystemSku\": \"596905010020200509187746\",\n" +
                "\t\"skuSpuId\": \"20200917152739403855573\",\n" +
                "\t\"pro3906833394\": \"亮黑色\",\n" +
                "\t\"skuId\": \"20200918144437295173408\",\n" +
                "\t\"skuImgurl\": \"https://smarthome.17wo.cn/fileresources-server/hyzd/20190425174518271947051/d3ac3f77bcb141508a63a3d3d5f02f7f.png\"\n" +
                "},\n" +
                "             {\n" +
                "\t\"limitNum\": 99999,\n" +
                "\t\"pro2348137327\": \"128GB\",\n" +
                "\t\"skuPrice\": 559900,\n" +
                "\t\"skuStock\": 88,\n" +
                "\t\"skuShopid\": \"1\",\n" +
                "\t\"skuType\": \"LJ\",\n" +
                "\t\"skuSaleNum\": 0,\n" +
                "\t\"skuName\": \"【优惠】华为 Mate30 Pro 5G 128GB 星河银\",\n" +
                "\t\"skuPreprice\": 559900,\n" +
                "\t\"minLimitNum\": 1,\n" +
                "\t\"orderSystemSku\": \"596905010020200509187744\",\n" +
                "\t\"skuSpuId\": \"20200917152739403855573\",\n" +
                "\t\"pro3906833394\": \"星河银\",\n" +
                "\t\"skuId\": \"20200917152739462637656\",\n" +
                "\t\"skuImgurl\": \"https://smarthome.17wo.cn/fileresources-server/hyzd/20190425174518271947051/d3ac3f77bcb141508a63a3d3d5f02f7f.png\"\n" +
                "}, {\n" +
                "\t\"limitNum\": 99999,\n" +
                "\t\"pro2348137327\": \"128GB\",\n" +
                "\t\"skuPrice\": 559900,\n" +
                "\t\"skuStock\": 49,\n" +
                "\t\"skuShopid\": \"1\",\n" +
                "\t\"skuType\": \"LJ\",\n" +
                "\t\"skuSaleNum\": 0,\n" +
                "\t\"skuName\": \"【优惠】华为 Mate30 Pro 5G 128GB 丹霞橙\",\n" +
                "\t\"skuPreprice\": 559900,\n" +
                "\t\"minLimitNum\": 1,\n" +
                "\t\"orderSystemSku\": \"596905010020200509187743\",\n" +
                "\t\"skuSpuId\": \"20200917152739403855573\",\n" +
                "\t\"pro3906833394\": \"丹霞橙\",\n" +
                "\t\"skuId\": \"20200918144437310372366\",\n" +
                "\t\"skuImgurl\": \"https://smarthome.17wo.cn/fileresources-server/hyzd/20190425174518271947051/d3ac3f77bcb141508a63a3d3d5f02f7f.png\"\n" +
                "}, {\n" +
                "\t\"limitNum\": 99999,\n" +
                "\t\"pro2348137327\": \"128GB\",\n" +
                "\t\"skuPrice\": 559900,\n" +
                "\t\"skuStock\": 0,\n" +
                "\t\"skuShopid\": \"1\",\n" +
                "\t\"skuType\": \"LJ\",\n" +
                "\t\"skuSaleNum\": 0,\n" +
                "\t\"skuName\": \"【优惠】华为 Mate30 Pro 5G 128GB 罗兰紫\",\n" +
                "\t\"skuPreprice\": 559900,\n" +
                "\t\"minLimitNum\": 1,\n" +
                "\t\"orderSystemSku\": \"596905010020200509187745\",\n" +
                "\t\"skuSpuId\": \"20200917152739403855573\",\n" +
                "\t\"pro3906833394\": \"罗兰紫\",\n" +
                "\t\"skuId\": \"20200918144437323900855\",\n" +
                "\t\"skuImgurl\": \"https://smarthome.17wo.cn/fileresources-server/hyzd/20190425174518271947051/d3ac3f77bcb141508a63a3d3d5f02f7f.png\"\n" +
                "}]}";
        JSONObject jsonObject1 =JSONObject.parseObject(goff);
        System.out.println(jsonObject1.get("skus"));
        String str = jsonObject1.get("skus").toString();
//        System.out.println(str);
        JSONArray test = JSONArray.parseArray(jsonObject1.get("skus").toString());
        System.out.println(test);
//        for (int i = 0; i < .length; i++) {
//            System.out.println(i+"***"+a[i]);
//            Object x = a.ge
//        }



    }

}
