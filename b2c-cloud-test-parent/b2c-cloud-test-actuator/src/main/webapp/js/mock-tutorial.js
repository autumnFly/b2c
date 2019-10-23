// 后台数据模拟神器
if (typeof document == "undefined") {
    Mock = require("C:\\Users\\yu\\node_global\\node_modules\\mockjs");
}
Mock.Random.extend({
    longMilliTime: function () {
        return new Date().getTime();
    }
});
let template = {
    //number 属性值自动加 1，初始值为 0。
    "responseCode|+1": 0,
    //number 生成一个大于等于 1、小于等于 100 的整数，属性值 0 只是用来确定类型
    "responseCode1|1-100": 0,
    //number 生成一个浮点数，整数部分大于等于 1、小于等于 100，小数部分保留 1 到 2 位。
    "doubleCode|1-100.1-2": 1.12,
    //string 通过重复 string 生成一个字符串，重复次数大于等于 1，小于等于 5。
    "responseMsg|1-5": "请求成功!",
    //string 通过重复 string 生成一个字符串，重复次数等于 2。
    "responseMsg1|2": "请求成功!",
    //boolean 随机生成一个布尔值，值为 true 的概率是 20 / (20 + 80)，值为 false 的概率是 80 / (20 + 80)。
    "isSuccess|20-80": true,
    //object 从citys的属性值中随机选取 2 到 4 个属性。
    "citys|2-4": {
        "110000": "北京市",
        "120000": "天津市",
        "130000": "黑龙江省",
        "140000": "四川省"
    },
    //array 通过重复data的属性值生成一个新数组，重复次数大于等于 2，小于等于 5。
    "data|2-5": [
        {
            //array 从names的属性值中随机选取 1 个元素，作为最终值。
            "names|1": [
                "yu",
                "yudong",
                "liang yudong"
            ],
            //array 从names1的属性值中顺序选取 1 个元素，作为最终值。
            "names1|+1": [
                "yu",
                "yudong",
                "liang yudong"
            ]
        }
    ],
    // regexp 生成符合该正则表达式的字符串
    "regexp": /TC\d{4}/,
    // @占位符 引用的是 Mock.Random 中的方法。通过 Mock.Random.extend() 来扩展自定义占位符。
    "boolean": '@boolean',
    "natural": '@natural',
    "integer": '@integer',
    "float": '@float',
    "character": '@character',
    "string": '@string',
    "range": '@range',
    "date": '@date',
    "time": '@time',
    "datetime": '@datetime',
    "now": '@now',
    "image": '@image',
    // 需要canvas
    //"dataImage": '@dataImage',
    "color": '@rgba',
    "paragraph": '@paragraph',
    "cparagraph": '@cparagraph',
    "sentence": '@sentence',
    "csentence": '@csentence',
    "word": '@word',
    "cword": '@cword',
    "title": '@title',
    "ctitle": '@ctitle(3)',
    "first": '@first',
    "cfirst": '@cfirst',
    "last": '@last',
    "clast": '@clast',
    "name": '@name',
    "cname": '@cname',
    "url": '@url',
    "domain": '@domain',
    "email": '@email',
    "ip": '@ip',
    "tld": '@tld',
    "region": '@region',
    "upper": '@upper("hello")',
    "pick": '@pick([1,5,8])',
    "shuffle": '@shuffle([1,5,8])',
    "guid": '@guid',
    "id": '@id',
    "longMilliTime": '@longMilliTime'
};
let data = Mock.mock(template);
console.log(JSON.stringify(data, null, 4));
let Random = Mock.Random;
console.log(JSON.stringify(Random.email(), null, 4));
console.log(new Date().getTime());
console.log(()=>{
    return Math.random()*100

});
()=>new Date(2018,3,25).getTime()
console.log((Math.random()*100).toFixed(0))
