if (typeof document === "undefined") {
    Mock = require("C:\\Users\\yu\\node_global\\node_modules\\mockjs");
}

var temStatus = {
    "isSuccess": true,
    "responseCode": 0,
    "responseMsg": "请求成功",
    "dictList": [
        {
            "dictID": "1",
            "dictName": "有效",
        },
        {
            "dictID": "0",
            "dictName": "无效",
        },
    ]
};
Mock.mock('/washingServiceMana/dict/getDictData', temStatus);
console.log(JSON.stringify(Mock.mock(temStatus), null, 4));
var temSuites = {
    "responseCode": 0,
    "isSuccess": true,
    "responseMsg": "请求成功",
    "data|5-10": [
        {
            "suiteCode": "TC@natural(1811000,1811999)",
            "suiteName": "套餐@cword(5)",
            "marketPrice": "@natural(1000,10000)",
            "opCode": "0",
            "opName|1": ["@name", "@cname"],
            "opTime": 1541753690000,
            "createCode": "0",
            "createName": "@name",
            "createTime": 1541753691000,
            "status|1": [0, 1],
            "showDetail": 1,
            "mainPicture": "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
            "specificsPictures": "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
            "specificsPicturesArray": ["https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg"],
            "detailPictures": "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg,https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
            "detailPicturesArray": ["https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg",
                "https://tmallapi.bluemoon.com.cn/img//group1//M00/02/A7/wKjwDlvo65iABI_-AABR96R1Izk111.jpg"]
        }
    ]
};
Mock.mock('/washingServiceMana/enterpriseItem/suite/getSuites', temSuites);
console.log(JSON.stringify(Mock.mock(temSuites), null, 4));
