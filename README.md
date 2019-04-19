# JsonCreateJs.java
使用代码解析json数据，获取json数据的所有字段，生成部分js代码

例如json内容为：
```json
{
  "requestId": "d846c7df74dd40c0a302788cc4bf68f8",
  "msg": "",
  "code": "0000",
  "data": {
    "specialSubjectList": [
      {
        "id": 47,
        "createTime": 1555065697000,
        "updateTime": 1555067667000,
        "createTimeStr": null,
        "name": "权游最终季观前指南",
        "sectionId": 399,
        "cover": "http://img.rr.tv/wondefulSectionCover/20190412/o_1555067665675.jpg?imageslim",
        "coverWidth": 1361,
        "coverHeight": 720,
        "redirectType": "NAVIGATION",
        "redirectTarget": "69",
        "startTime": 1555000709000,
        "endTime": 1588156706000,
        "sequence": 47,
        "enabled": true,
        "redirectSchema": "rrspjump://navigationSummary?navigationId=69"
      },
      {
        "id": 46,
        "createTime": 1554882898000,
        "updateTime": 1554887427000,
        "createTimeStr": null,
        "name": "4月追剧计划",
        "sectionId": 399,
        "cover": "http://img.rr.tv/wondefulSectionCover/20190410/o_1554882835350.png?imageslim",
        "coverWidth": 750,
        "coverHeight": 400,
        "redirectType": "NAVIGATION",
        "redirectTarget": "68",
        "startTime": 1554796322000,
        "endTime": 1588233193000,
        "sequence": 46,
        "enabled": true,
        "redirectSchema": "rrspjump://navigationSummary?navigationId=68"
      },
      {
        "id": 41,
        "createTime": 1543989143000,
        "updateTime": 1543989143000,
        "createTimeStr": null,
        "name": "2018秋季档Vol.3",
        "sectionId": 399,
        "cover": "http://img.rr.tv/wondefulSectionCover/20181205/o_1543989146500.jpg?imageslim",
        "coverWidth": 1200,
        "coverHeight": 827,
        "redirectType": "NAVIGATION",
        "redirectTarget": "60",
        "startTime": 1543988850000,
        "endTime": 1577771257000,
        "sequence": 37,
        "enabled": true,
        "redirectSchema": "rrspjump://navigationSummary?navigationId=60"
      },
      {
        "id": 36,
        "createTime": 1538993313000,
        "updateTime": 1538993313000,
        "createTimeStr": null,
        "name": "十一追剧专题",
        "sectionId": 399,
        "cover": "http://img.rr.tv/wondefulSectionCover/20181008/o_1538993318428.jpg?imageslim",
        "coverWidth": 861,
        "coverHeight": 473,
        "redirectType": "NAVIGATION",
        "redirectTarget": "59",
        "startTime": 1538993134000,
        "endTime": 1572516339000,
        "sequence": 36,
        "enabled": true,
        "redirectSchema": "rrspjump://navigationSummary?navigationId=59"
      }
    ],
    "filmTelevsionList": [
      {
        "id": 10001,
        "createTime": 1495541426000,
        "updateTime": 1495541423000,
        "content": "粉雄救兵",
        "name": "美剧",
        "imgUrl": "http://img.rr.tv/screenshot/20180508/o_1525758947342.jpg",
        "enabled": "1",
        "key": "USK",
        "seq": 8
      },
      {
        "id": 10005,
        "createTime": null,
        "updateTime": null,
        "content": "",
        "name": "韩剧",
        "imgUrl": "",
        "enabled": "1",
        "key": "KR",
        "seq": 7
      },
      {
        "id": 10003,
        "createTime": 1495541477000,
        "updateTime": 1495541475000,
        "content": "情妇",
        "name": "日剧",
        "imgUrl": "http://img.rr.tv/screenshot/20180502/o_1525255633767.jpg",
        "enabled": "1",
        "key": "JP",
        "seq": 6
      },
      {
        "id": 10004,
        "createTime": 1495541533000,
        "updateTime": 1495541531000,
        "content": "皎洁的月",
        "name": "泰剧",
        "imgUrl": "http://img.rr.tv/screenshot/20180507/o_1525663819741.jpg",
        "enabled": "1",
        "key": "TH",
        "seq": 5
      }
    ],
    "categoryDetailViewList": [
      {
        "id": 2,
        "categoryName": "娱乐",
        "videoList": [
          {
            "id": 1716734,
            "createTime": 1555643490567,
            "updateTime": 1555643490567,
            "title": "霉霉\"举世闻名\"巡演官方释出，霸气性感安静可爱",
            "cover": "http://img.rr.tv/videoCover/20190101/o_1546335546820.gif",
            "duration": "14:10",
            "brief": "泰勒·斯威夫特：举世盛名巡演大电影来袭啦！",
            "playCount": 1685448,
            "uperId": 26091332,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 26091332,
              "nickName": "半路冒出个嘟嘟刘",
              "headImgUrl": "https://img.rr.tv/head/20171101/o_1509522536413.png",
              "level": "6",
              "score": 2059,
              "roleInfo": "official",
              "sign": "",
              "intro": "",
              "addGrowth": "40%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "OFFICIAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2105192,
            "createTime": 1555643490577,
            "updateTime": 1555643490577,
            "title": "麦当娜：10年前老娘50岁，你瞧瞧",
            "cover": "http://img.rr.tv/videoCover/20190418/o_1555568621358.jpg",
            "duration": "04:31",
            "brief": "Madonna - Vogue [Sticky & Sweet Tour]",
            "playCount": 218867,
            "uperId": 26091332,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 26091332,
              "nickName": "半路冒出个嘟嘟刘",
              "headImgUrl": "https://img.rr.tv/head/20171101/o_1509522536413.png",
              "level": "6",
              "score": 2059,
              "roleInfo": "official",
              "sign": "",
              "intro": "",
              "addGrowth": "40%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "OFFICIAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 1786978,
            "createTime": 1555643490621,
            "updateTime": 1555643490621,
            "title": "木村拓哉×窦靖童地铁尬舞，Levi's广告公开",
            "cover": "https://img.rr.tv/ugc/20190122/o_1548147415380.png",
            "duration": "01:01",
            "brief": "木村拓哉×窦靖童地铁尬舞，Levi's Engineered Jeans Brand Movie公开",
            "playCount": 80720,
            "uperId": 12482656,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 12482656,
              "nickName": "字幕菌日语",
              "headImgUrl": "https://img.rr.tv/head/20170626/o_1498454294477.png",
              "level": "9",
              "score": 7206,
              "roleInfo": "official",
              "sign": "带你领略不一样的日本文化",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2106410,
            "createTime": 1555643490655,
            "updateTime": 1555643490655,
            "title": "当爱豆在颁奖典礼看到自己的广告时的反应 太可爱啦!",
            "cover": "https://img.rr.tv/ugc/20190418/o_1555576435172.png",
            "duration": "00:56",
            "brief": "当爱豆在颁奖典礼看到自己的广告时的反应 太可爱啦!",
            "playCount": 41137,
            "uperId": 15752032,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 15752032,
              "nickName": "字幕菌韩语",
              "headImgUrl": "https://img.rr.tv/head/20170930/o_1506742590045.png",
              "level": "11",
              "score": 12476,
              "roleInfo": "official",
              "sign": "一些比泡菜更有意思的东西",
              "intro": "",
              "addGrowth": "30%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "OFFICIAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          }
        ],
        "sequence": 0,
        "leafCategoryList": [
          {
            "id": 130,
            "name": "脱口秀",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_talk show@3x130.png"
          },
          {
            "id": 128,
            "name": "创意广告",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_creative ad@3x128.png"
          },
          {
            "id": 131,
            "name": "游戏",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_game@3x131.png"
          },
          {
            "id": 129,
            "name": "热点",
            "fixed": false,
            "logUrl": ""
          },
          {
            "id": 149,
            "name": "明星",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_star@3x149.png"
          },
          {
            "id": 212,
            "name": "娱乐访谈",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_interview@3x212.png"
          },
          {
            "id": 217,
            "name": "现场",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791823971.png"
          },
          {
            "id": 218,
            "name": "音乐翻唱",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791846463.png"
          },
          {
            "id": 219,
            "name": "舞蹈",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791872665.png"
          },
          {
            "id": 233,
            "name": "综艺",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791600628.png"
          },
          {
            "id": 234,
            "name": "娱乐资讯",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791747598.png"
          }
        ],
        "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_entertianment@3x.png"
      },
      {
        "id": 3,
        "categoryName": "影视花絮",
        "videoList": [
          {
            "id": 2102372,
            "createTime": 1555643490755,
            "updateTime": 1555643490755,
            "title": "<复联4>新预告 MCU电影混剪 回顾11年间英雄高光时刻！",
            "cover": "https://img.rr.tv/ugc/20190417/o_1555503158753.jpg",
            "duration": "02:29",
            "brief": "<复联4>新预告 MCU电影混剪 回顾11年间英雄高光时刻！",
            "playCount": 63597,
            "uperId": 8194830,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 8194830,
              "nickName": "小小反派",
              "headImgUrl": "https://img.rr.tv/head/20170111/o_1484139058816.jpg",
              "level": "17",
              "score": 36499,
              "roleInfo": "normal",
              "sign": "分享影视",
              "intro": "",
              "addGrowth": "115%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2099641,
            "createTime": 1555643490767,
            "updateTime": 1555643490767,
            "title": "魔鬼混剪 琼恩&珊莎被剪出CP感",
            "cover": "https://img.rr.tv/ugc/20190417/o_1555472507508.png",
            "duration": "01:11",
            "brief": "国 73集（八季）\n《权力的游戏》（Game of Thrones），是美国HBO电视网制作推出的一部中世纪史诗奇幻题材的电视剧。该剧改编自美国作家乔治·R·R·马丁的奇幻小说《冰与火之歌》系列。由戴维·贝尼奥夫、D·B·威斯、艾伦·泰勒等人执导，大卫·贝尼奥夫和D·B·威斯编剧，乔治·马丁担任剧本顾问，彼特·丁拉基、琳娜·海蒂、艾米莉亚·克拉克、基特·哈灵顿等人主演",
            "playCount": 118791,
            "uperId": 7972370,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 7972370,
              "nickName": "字幕菌影视",
              "headImgUrl": "https://img.rr.tv/head/20160801/o_1470049097928.png",
              "level": "13",
              "score": 18482,
              "roleInfo": "official",
              "sign": "大家好！",
              "intro": "",
              "addGrowth": "30%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "OFFICIAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2109450,
            "createTime": 1555643490812,
            "updateTime": 1555643490812,
            "title": "《她的私生活》第5集预告 刺激！船戏说来就来！",
            "cover": "https://img.rr.tv/ugc/20190419/o_1555639847594.png",
            "duration": "00:31",
            "brief": "【韩剧预告】《她的私生活》第5集预告 刺激！船戏说来就来！",
            "playCount": 1453,
            "uperId": 15752032,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 15752032,
              "nickName": "字幕菌韩语",
              "headImgUrl": "https://img.rr.tv/head/20170930/o_1506742590045.png",
              "level": "11",
              "score": 12476,
              "roleInfo": "official",
              "sign": "一些比泡菜更有意思的东西",
              "intro": "",
              "addGrowth": "30%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "OFFICIAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2104332,
            "createTime": 1555643490841,
            "updateTime": 1555643490841,
            "title": "恐怖短片《Turned》，我的妈妈变成了丧尸！",
            "cover": "https://img.rr.tv/argus/cover/20180731/o_5b5ffe602e13e0659952d484.jpg?imageMogr2/thumbnail/1280x/gravity/Center/crop/1280x720",
            "duration": "12:13",
            "brief": "恐怖短片《Turned》，我的妈妈变成了丧尸！http://t.cn/RgVv3dE ​\n",
            "playCount": 341390,
            "uperId": 56121750,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 56121750,
              "nickName": "Alex在此",
              "headImgUrl": "https://img.rr.tv/head/20180409/o_1523249416334.jpg",
              "level": "23",
              "score": 150048,
              "roleInfo": "normal",
              "sign": "",
              "intro": "",
              "addGrowth": "140%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          }
        ],
        "sequence": 0,
        "leafCategoryList": [
          {
            "id": 148,
            "name": "原创",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_original@3x148.png"
          },
          {
            "id": 150,
            "name": "美漫",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791441056.png"
          },
          {
            "id": 147,
            "name": "预告",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791484414.png"
          },
          {
            "id": 211,
            "name": "混剪",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_mixed shear@3x211.png"
          },
          {
            "id": 223,
            "name": "盘点",
            "fixed": false,
            "logUrl": null
          },
          {
            "id": 224,
            "name": "影评解析",
            "fixed": false,
            "logUrl": null
          },
          {
            "id": 225,
            "name": "影视片段",
            "fixed": false,
            "logUrl": null
          }
        ],
        "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_titbits@3x.png"
      },
      {
        "id": 7,
        "categoryName": "音乐",
        "videoList": [],
        "sequence": 0,
        "leafCategoryList": [],
        "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_reversion@3x214.png"
      },
      {
        "id": 8,
        "categoryName": "科技",
        "videoList": [
          {
            "id": 2088927,
            "createTime": 1555643490915,
            "updateTime": 1555643490915,
            "title": "【原创中字】MKBHD的专业摄影装备总览！",
            "cover": "https://img.rr.tv/ugc/20190414/o_1555246203386.jpg",
            "duration": "20:14",
            "brief": "看更多第一时间翻译的海外科技视频，请关注我吧！\nB站&微博&人人视频：刘爱国科技\n即刻App：刘爱国科技\n",
            "playCount": 1035,
            "uperId": 56668442,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 56668442,
              "nickName": "刘爱国科技",
              "headImgUrl": "https://img.rr.tv/head/20190323/o_1553306789074.png",
              "level": "3",
              "score": 551,
              "roleInfo": "normal",
              "sign": "一个有自己态度和观点的科技博主~ \nB站&微博&即刻App：刘爱国科技",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 44580,
            "createTime": 1555643490943,
            "updateTime": 1555643490943,
            "title": "礼貌英语：什么话绝对别说！",
            "cover": "https://img.rr.tv/video/20160509/o_4453476849.png",
            "duration": "08:52",
            "brief": "转自：bilibili 原UP主：译学馆\r\n感谢原创up主为我们带来的原创精彩视频",
            "playCount": 6877,
            "uperId": 7175532,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 7175532,
              "nickName": "神圣的和平",
              "headImgUrl": "https://img.rr.tv/head/20160530/o_1464603731370.png",
              "level": "1",
              "score": 6,
              "roleInfo": "normal",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2107063,
            "createTime": 1555643490980,
            "updateTime": 1555643490980,
            "title": "Galaxy Fold曝屏幕故障三星正在调查",
            "cover": "https://img.rr.tv/ugc/20190418/o_1555582986098.jpg",
            "duration": "04:34",
            "brief": "Galaxy Fold曝屏幕故障三星正在调查；一加7 Pro将配2K曲面屏",
            "playCount": 1476,
            "uperId": 14131250,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 14131250,
              "nickName": "VDGER",
              "headImgUrl": "https://img.rr.tv/head/20170428/o_1493342097749.jpg",
              "level": "1",
              "score": 0,
              "roleInfo": "normal",
              "sign": "专注为您提供最新最好玩儿的科技资讯及数码体验！",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2106857,
            "createTime": 1555643491028,
            "updateTime": 1555643491028,
            "title": "三星A80上手体验：真的比S10e还好？",
            "cover": "https://img.rr.tv/ugc/20190418/o_1555580726923.png",
            "duration": "03:36",
            "brief": "三星A80上手体验：真的比S10e还好？",
            "playCount": 2031,
            "uperId": 7972372,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 7972372,
              "nickName": "字幕菌科技",
              "headImgUrl": "https://img.rr.tv/head/20160801/o_1470047069908.png",
              "level": "12",
              "score": 15848,
              "roleInfo": "official",
              "sign": "订阅字幕菌科技，抢先一步了解更多",
              "intro": "",
              "addGrowth": "15%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          }
        ],
        "sequence": 0,
        "leafCategoryList": [
          {
            "id": 152,
            "name": "数码",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_digital producation@3x152.png"
          },
          {
            "id": 154,
            "name": "科普",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_kepu@3x154.png"
          },
          {
            "id": 151,
            "name": "新科技",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_xinkeji@3x151.png"
          },
          {
            "id": 153,
            "name": "机车机械",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_locomotive@3x153.png"
          },
          {
            "id": 213,
            "name": "应用程序",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_software@3x213.png"
          }
        ],
        "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_keji@3x.png"
      },
      {
        "id": 9,
        "categoryName": "生活",
        "videoList": [
          {
            "id": 203489,
            "createTime": 1555643491123,
            "updateTime": 1555643491123,
            "title": "【健康生活】XHIT维密天使手臂塑形训练#Lipstickism字",
            "cover": "https://img.rr.tv/video/20170710/o_1499679249685.jpg",
            "duration": "08:22",
            "brief": "【健康生活】XHIT维密天使手臂塑形训练#Lipstickism字幕组",
            "playCount": 8920,
            "uperId": 4273212,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 4273212,
              "nickName": "骑着乌龟装坦克",
              "headImgUrl": "https://img.rr.tv/head/20150509/o_1431137457640.png",
              "level": "2",
              "score": 307,
              "roleInfo": "normal",
              "sign": null,
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2100402,
            "createTime": 1555643491151,
            "updateTime": 1555643491151,
            "title": "罗茜·汉丁顿-惠特莉3分钟眼妆",
            "cover": "https://img.rr.tv/ugc/20190417/o_1555482636972.png",
            "duration": "03:15",
            "brief": "罗茜·汉丁顿-惠特莉3分钟眼妆                   ",
            "playCount": 2570,
            "uperId": 7972340,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 7972340,
              "nickName": "字幕菌生活",
              "headImgUrl": "https://img.rr.tv/head/20160801/o_1470047197738.png",
              "level": "1",
              "score": 1112,
              "roleInfo": "official",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "OFFICIAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2101800,
            "createTime": 1555643491188,
            "updateTime": 1555643491188,
            "title": "测评哪种饮料最解腻，我把油条扔进麻辣牛油火锅里！",
            "cover": "https://img.rr.tv/ugc/20190417/o_1555497364795.jpeg",
            "duration": "05:45",
            "brief": "测评哪种饮料最解腻，我把油条扔进麻辣牛油火锅里！",
            "playCount": 56292,
            "uperId": 96933898,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 96933898,
              "nickName": "小白白奶糖",
              "headImgUrl": "https://img.rr.tv/head/20190408/o_1554731294882.png",
              "level": "4",
              "score": 1166,
              "roleInfo": "normal",
              "sign": "Hey，有趣一点🤔",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2103336,
            "createTime": 1555643491201,
            "updateTime": 1555643491201,
            "title": "[木下佑香]品尝可爱的彩虹独角兽谷物脆片",
            "cover": "https://img.rr.tv/ugc/20190418/o_1555517977322.png",
            "duration": "10:03",
            "brief": "YouTube木下自频道搬运作品，原地址：https://www.youtube.com/watch?v=tIT753F5KzI&t=5s\n版权所有：木下ゆうか",
            "playCount": 2820,
            "uperId": 8858867,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 8858867,
              "nickName": "草莓坏坏",
              "headImgUrl": "https://img.rr.tv/head/20161020/o_1476949924420.jpeg",
              "level": "5",
              "score": 1832,
              "roleInfo": "normal",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "COOPERATIVE",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          }
        ],
        "sequence": 0,
        "leafCategoryList": [
          {
            "id": 142,
            "name": "搞笑",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_funny@3x142.png"
          },
          {
            "id": 145,
            "name": "萌趣",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791911564.png"
          },
          {
            "id": 144,
            "name": "美食",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_food@3x144.png"
          },
          {
            "id": 146,
            "name": "美女",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_girl@3x146.png"
          },
          {
            "id": 143,
            "name": "日常",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_daily@3x143.png"
          },
          {
            "id": 226,
            "name": "旅行",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791764862.png"
          },
          {
            "id": 227,
            "name": "达人",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791720898.png"
          },
          {
            "id": 228,
            "name": "Vlog",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791679108.png"
          },
          {
            "id": 229,
            "name": "美妆",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791654827.png"
          },
          {
            "id": 230,
            "name": "情感",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791648742.png"
          },
          {
            "id": 231,
            "name": "手工",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791619164.png"
          },
          {
            "id": 232,
            "name": "热门",
            "fixed": false,
            "logUrl": "http://img.rr.tv/subCategoryIcon/20181121/o_1542791607797.png"
          }
        ],
        "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_life@3x.png"
      },
      {
        "id": 10,
        "categoryName": "体育",
        "videoList": [
          {
            "id": 2093389,
            "createTime": 1555643491301,
            "updateTime": 1555643491301,
            "title": "韩国小姐姐全身拉伸运动，健身前后必不可少哦",
            "cover": "https://img.rr.tv/ugc/20190415/o_1555333525513.jpg",
            "duration": "08:32",
            "brief": "韩国小姐姐全身拉伸运动，健身前后必不可少哦",
            "playCount": 5322,
            "uperId": 14474746,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 14474746,
              "nickName": "草莓味鸡胸肉",
              "headImgUrl": "https://tva2.sinaimg.cn/crop.0.0.500.500.50/a4867511jw8ep2v3tyclij20dw0dw40s.jpg",
              "level": "2",
              "score": 426,
              "roleInfo": "normal",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 1970234,
            "createTime": 1555643491322,
            "updateTime": 1555643491322,
            "title": "韩国美女小姐姐，挑战4周练出马甲线",
            "cover": "https://img.rr.tv/ugc/20190311/o_1552269857002.jpg",
            "duration": "09:21",
            "brief": "韩国美女小姐姐，挑战4周练出马甲线哦！！",
            "playCount": 20574,
            "uperId": 14474746,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 14474746,
              "nickName": "草莓味鸡胸肉",
              "headImgUrl": "https://tva2.sinaimg.cn/crop.0.0.500.500.50/a4867511jw8ep2v3tyclij20dw0dw40s.jpg",
              "level": "2",
              "score": 426,
              "roleInfo": "normal",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 1789021,
            "createTime": 1555643491376,
            "updateTime": 1555643491376,
            "title": "跟着Kate老师串联瑜珈(YOGA) 2招在家瘦肚子瘦腰 ｜VOGUE 健身教室",
            "cover": "https://img.rr.tv/argus/cover/20181011/o_5bbea25afc804802787faa96.jpg?imageMogr2/thumbnail/1280x/gravity/Center/crop/1280x720",
            "duration": "02:52",
            "brief": "老是嚷着要减肥、要瘦小腹、瘦肚子、瘦腰，却又忙到没时间到健身房运动？！建议你不妨跟着【VOGUE爱瑜珈】邀来的Kate老师一起学会这两招串连瑜珈，在家就能做腰腹训练，瘦肚子、瘦腰，超有效。\\n\\n#健身教室 #瑜珈  #YOGA\\n------------------------------\\n【 其他热门主题推荐 】\\n1⃣ 秘技片：女星变美＆化妆包 ► http://bit.ly/2vWUYMS\\n2⃣ 时尚：穿搭、精品 ► http://bit.ly/2FfFvbi\\n3⃣ 瘦身：瘦腿、塑腰、练翘臀 ► http://bit.ly/2f7qFHW\\n4⃣ 名人：世界拍摄封面特辑 ► http://bit.ly/2pPOCsi \\n5⃣ 美容：保养 / 彩妆技巧  ► http://bit.ly/2fns0cP\\n6⃣ 73个快问快答＋欧美明星搜包 ► http://bit.ly/2yKtwDj\\n------------------------------\\n✨ 喜欢影片请记得帮我们按喜欢或是留言＋订阅 http://bit.ly/2eoVk7R\\n✨ Still haven’t subscribed to Vogue Taiwan on YouTube? ►► http://bit.ly/2eoVk7R\\n------------------------------\\n【更多VOGUE TAIWAN】\\nFacebook：https://www.facebook.com/VogueTW/  \\nWeb：http://www.vogue.com.tw/live/\\nInstagram：https://www.instagram.com/voguetaiwan/ \\nLINE：voguetaiwan\\n\\n------------------------------\\n※关于时尚，VOGUE说了算！自从1892年第一本VOGUE在美国出版以来，至今已有122年的历史，始终被时尚专业人士所推崇，因此荣誉为Fashion Bible时尚圣经",
            "playCount": 981,
            "uperId": 28250100,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 28250100,
              "nickName": "VOGUE Taiwan-TV",
              "headImgUrl": "https://img.rr.tv/argus/head/20171121/o_5a1336418e798f06f58eaa1a.jpg",
              "level": "3",
              "score": 480,
              "roleInfo": "normal",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 2099449,
            "createTime": 1555643491391,
            "updateTime": 1555643491391,
            "title": "睡前8分钟锻炼 帮你打造完美身材!  ",
            "cover": "https://img.rr.tv/ugc/20190417/o_1555469212843.jpg",
            "duration": "13:53",
            "brief": "睡前8分钟锻炼 帮你打造完美身材!  \n不要再找借口 说白天没时间锻炼啦",
            "playCount": 7553,
            "uperId": 12482507,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 12482507,
              "nickName": "字幕菌体育",
              "headImgUrl": "https://img.rr.tv/head/20170228/o_1488243378019.png",
              "level": "1",
              "score": 118,
              "roleInfo": "official",
              "sign": "指尖汇聚世界精彩！！！",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          }
        ],
        "sequence": 0,
        "leafCategoryList": [
          {
            "id": 140,
            "name": "极限运动",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_x-sport@3x140.png"
          },
          {
            "id": 141,
            "name": "健身",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_bodybuilding@3x141.png"
          },
          {
            "id": 137,
            "name": "NBA",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_nba@3x137.png"
          },
          {
            "id": 139,
            "name": "功夫搏击",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_kungfu@3x139.png"
          },
          {
            "id": 138,
            "name": "足球",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_football@3x138.png"
          }
        ],
        "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_sport@3x.png"
      },
      {
        "id": 11,
        "categoryName": "新知",
        "videoList": [
          {
            "id": 1534066,
            "createTime": 1555643491448,
            "updateTime": 1555643491448,
            "title": "一步一步地简单的山水画教程水彩画",
            "cover": "https://img.rr.tv/argus/cover/20180903/o_5b897b078e798f25dc08a5d7.jpg?imageMogr2/thumbnail/1280x/gravity/Center/crop/1280x720",
            "duration": "14:36",
            "brief": "Easy landscape painting tutorial | Watercolor painting | step by step\\n\\nIn this video i have painted a easy landscape in watercolor step by step.\\nHope you enjoyed the video.\\n\\n if you like this painting please subscribe my channel.\\n\\n\\nMaterials used: Indian handmade paper\\n\\ncolor : camlin artist watercolor\\n\\nVermilion red\\nYellow ochre \\nUltamarine blue \\nSap green\\nlemon yellow\\nLight green\\n Brunt sienna \\n\\nvideo recorded using Apple iphone 6.\\n\\n Music: youtube audio library",
            "playCount": 22458,
            "uperId": 72726978,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 72726978,
              "nickName": "Art easel & pencil-TV",
              "headImgUrl": null,
              "level": "3",
              "score": 480,
              "roleInfo": "normal",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 604352,
            "createTime": 1555643491499,
            "updateTime": 1555643491499,
            "title": "目前正火的中央台大型文博探索节目——国家宝藏第八集",
            "cover": "https://img.rr.tv/video/20180130/o_1517269449635.jpg",
            "duration": "1:47:01",
            "brief": "    “让国宝活起来”，1月28日晚，由央视综艺频道（CCTV-3）联合九大国家级博物馆（院）共同推出的大型文博探索节目《国家宝藏》第八集播出。\r\n      作为中国古代文明的发祥地之一，浙江素有“丝绸之府，文物之邦”的美誉。在这片历史悠久、文化灿烂的土壤上，浙江人用自己的智慧筑成了一座独具匠心的“园中馆，馆中园”——浙江省博物馆。节目中，青年演员任重、“老戏骨”孙淳以及“90后”金马影后周冬雨惊喜现身，一同守护宁波“万工轿”、落霞式“彩凤鸣岐”七弦琴、玉琮这三件万里挑一的传世国宝。",
            "playCount": 168432,
            "uperId": 15508492,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 15508492,
              "nickName": "Sloanhsu",
              "headImgUrl": "https://img.rr.tv/head/20180719/o_1531998458621.png",
              "level": "27",
              "score": 348142,
              "roleInfo": "normal",
              "sign": "希望大家喜欢，打赏点银币！",
              "intro": "",
              "addGrowth": "310%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 1921686,
            "createTime": 1555643491524,
            "updateTime": 1555643491524,
            "title": "青春期男孩身体发生的五个变化，你经历过吗",
            "cover": "https://img.rr.tv/ugc/20190228/o_1551332714767.jpg",
            "duration": "05:01",
            "brief": "青春期男孩身体发生的五个变化，青春痘、长高、毛发......",
            "playCount": 50547,
            "uperId": 12482582,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 12482582,
              "nickName": "字幕菌-新知",
              "headImgUrl": "https://img.rr.tv/head/20170508/o_1494228496232.png",
              "level": "1",
              "score": 18,
              "roleInfo": "official",
              "sign": "",
              "intro": "",
              "addGrowth": "0%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": null,
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          },
          {
            "id": 1953491,
            "createTime": 1555643491542,
            "updateTime": 1555643491542,
            "title": "斯坦福学姐：语言有改变人生的力量",
            "cover": "https://img.rr.tv/ugc/20190306/o_1551883970345.jpg",
            "duration": "08:49",
            "brief": "一出生就是耳聋的卡洛琳，在母亲坚持不懈地努力下，最终学会了说话。在她的故事中，语言多次给予了她非凡的生命动力，希望我们也能了解并拥有语言的力量",
            "playCount": 1080,
            "uperId": 3482234,
            "commentCount": 0,
            "likeCount": 0,
            "videoAuthor": {
              "id": 3482234,
              "nickName": "雪影西风",
              "headImgUrl": "https://img.rr.tv/head/20180811/o_1533971328765.jpg",
              "level": "23",
              "score": 146480,
              "roleInfo": "normal",
              "sign": "凉风知我意，随梦到南洲",
              "intro": "",
              "addGrowth": "125%",
              "videoCount": null,
              "seasonCount": 0,
              "focused": false,
              "certLabel": "NORMAL",
              "certNote": null
            },
            "liked": false,
            "createTimeStr": "刚刚"
          }
        ],
        "sequence": 0,
        "leafCategoryList": [
          {
            "id": 155,
            "name": "公开课",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_open class@3x155.png"
          },
          {
            "id": 159,
            "name": "科教",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_kejiao@3x159.png"
          },
          {
            "id": 158,
            "name": "文史",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_history@3x158.png"
          },
          {
            "id": 157,
            "name": "自然",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_natural@3x157.png"
          },
          {
            "id": 156,
            "name": "学外语",
            "fixed": false,
            "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_language@3x156.png"
          },
          {
            "id": 235,
            "name": "TED",
            "fixed": false,
            "logUrl": ""
          }
        ],
        "logUrl": "https://img.rr.tv/static/images/20181022/img_menu_record@3x.png"
      }
    ]
  }
}
```

最后运行结果为：
```js
var bodyKey=["msg","code","data","requestId"]
checkValue(body, bodyKey)

var specialSubjectList=["updateTime","sectionId","redirectTarget","enabled","cover","coverHeight","sequence","createTime","redirectSchema","name","coverWidth","startTime","id","redirectType","endTime","createTimeStr"]
checkValue(body.data.specialSubjectList, specialSubjectList)

var filmTelevsionList=["imgUrl","createTime","name","updateTime","id","content","enabled","key","seq"]
checkValue(body.data.filmTelevsionList, filmTelevsionList)

var categoryDetailViewList=["sequence","leafCategoryList","videoList","id","logUrl","categoryName"]
checkValue(body.data.categoryDetailViewList, categoryDetailViewList)

var dataKey=["specialSubjectList","filmTelevsionList","categoryDetailViewList"]
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

var specialSubjectList=["updateTime","sectionId","redirectTarget","enabled","cover","coverHeight","sequence","createTime","redirectSchema","name","coverWidth","startTime","id","redirectType","endTime","createTimeStr"]
checkValue(body.data.specialSubjectList[0], specialSubjectList)

var filmTelevsionList=["imgUrl","createTime","name","updateTime","id","content","enabled","key","seq"]
checkValue(body.data.filmTelevsionList[0], filmTelevsionList)

var categoryDetailViewList=["sequence","leafCategoryList","videoList","id","logUrl","categoryName"]
checkValue(body.data.categoryDetailViewList[0], categoryDetailViewList)

var dataKey=["specialSubjectList","filmTelevsionList","categoryDetailViewList"]
checkValue(body.data, dataKey)

```
