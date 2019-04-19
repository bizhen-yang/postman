# JsonCreateJs.java
使用代码解析json数据，获取json数据的所有字段，生成部分js代码

例如json内容为：
```json
{
  "requestId": "47d145b1d0164ac7b9bc2e82b0ae3d3b",
  "msg": "",
  "code": "0000",
  "data": {
    "result": [
      {
        "id": 513,
        "cover": "https://img.test/album/20180404/o_1522840084933.jpg",
        "name": "高能反转的烧脑神剧",
        "videoCount": 8,
        "type": "season",
        "seasonList": null,
        "brief": "高智商烧脑悬疑英美剧，让我们的脑细胞躁动起来吧~~"
      },
      {
        "id": 419,
        "cover": "https://img.test/album/20180108/o_1515392963542.jpg",
        "name": "2017年度最佳人气惊悚类",
        "videoCount": 5,
        "type": "season_toplist",
        "seasonList": null,
        "brief": "2017年度最佳人气惊悚类，排名基于惊悚类剧集在人人视频的播放量。"
      },
      {
        "id": 413,
        "cover": "https://img.test/album/20180108/o_1515391132388.jpg",
        "name": "2017年度冷门好剧",
        "videoCount": 5,
        "type": "season_toplist",
        "seasonList": null,
        "brief": "冷门好剧，一般人我不告诉他。"
      },
      {
        "id": 421,
        "cover": "https://img.test/album/20180108/o_1515393273366.jpg",
        "name": "2017年度最佳人气奇幻类",
        "videoCount": 5,
        "type": "season_toplist",
        "seasonList": null,
        "brief": "2017年度最佳人气奇幻类，排名基于奇幻类剧集在人人视频的播放量。"
      },
      {
        "id": 415,
        "cover": "https://img.test/album/20180108/o_1515391689541.jpg",
        "name": "2017年度最佳人气剧情类",
        "videoCount": 5,
        "type": "season_toplist",
        "seasonList": null,
        "brief": "2017年度最佳人气剧情类，排名基于剧情类剧集在人人视频的播放量。"
      }
    ],
    "total": 0,
    "isEnd": false
  }
}
```

最后运行结果为：
```js
var bodyKey=["msg","code","data","requestId"]
checkValue(body, bodyKey)

var result=["cover","videoCount","brief","name","seasonList","id","type"]
checkValue(body.data.result, result)

var dataKey=["result","total","isEnd"]
checkValue(body.data, dataKey)


```

Test断言脚本最终为如下内容，可以完成所有字段的检查：
```js
assert.equal(status, 200)

assert.deepEqual(body.code, "0000");

function checkValue(data, keys){
    var flag = true
    var lessKey;
    for (var i=0; i<keys.length; i++){
        if (!data.hasOwnProperty(keys[i]) ){
            flag = false;
            lessKey = keys[i]
            break;
        }
    }

    assert.deepEqual(flag, true,"缺少字段"+lessKey);
}


var bodyKey=["msg","code","data","requestId"]
checkValue(body, bodyKey)

var result=["cover","videoCount","brief","name","seasonList","id","type"]
//result为数组，使用第一个元素
checkValue(body.data.result[0], result)

var dataKey=["result","total","isEnd"]
checkValue(body.data, dataKey)


```
