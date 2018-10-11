# springboot-mybatis
springboot-mybatis-basicDemo

springboot-mybatis  进阶一对一查询  一对多查询 多对多查询

请求：http://localhost:8082/users
方式：GET
返回：[
  {
    "id": 1,
    "userName": "王五",
    "sex": "2",
    "address": null,
    "birthday": null,
    "ordersList": null
  },
  {
    "id": 2,
    "userName": "张三",
    "sex": "1",
    "address": "北京市",
    "birthday": 1404921600000,
    "ordersList": null
  },
  {
    "id": 3,
    "userName": "张小明",
    "sex": "1",
    "address": "河南郑州",
    "birthday": null,
    "ordersList": null
  },
  {
    "id": 4,
    "userName": "陈小明",
    "sex": "1",
    "address": "河南郑州",
    "birthday": null,
    "ordersList": null
  },
  {
    "id": 5,
    "userName": "张三丰",
    "sex": "1",
    "address": "河南郑州",
    "birthday": null,
    "ordersList": null
  },
  {
    "id": 6,
    "userName": "陈小明",
    "sex": "1",
    "address": "河南郑州",
    "birthday": null,
    "ordersList": null
  },
  {
    "id": 7,
    "userName": "王五",
    "sex": null,
    "address": null,
    "birthday": null,
    "ordersList": null
  },
  {
    "id": 8,
    "userName": "小A",
    "sex": "2",
    "address": "北京",
    "birthday": 1435334400000,
    "ordersList": null
  },
  {
    "id": 9,
    "userName": "小B",
    "sex": "2",
    "address": "北京",
    "birthday": 1435334400000,
    "ordersList": null
  },
  {
    "id": 10,
    "userName": "小C",
    "sex": "1",
    "address": "北京",
    "birthday": 1435334400000,
    "ordersList": null
  },
  {
    "id": 11,
    "userName": "小D",
    "sex": "2",
    "address": "北京",
    "birthday": 1435334400000,
    "ordersList": null
  }
]

请求：http://localhost:8082/users/orders
方式：GET
返回：[
  {
    "id": 8,
    "userid": null,
    "number": "1000010",
    "createTime": 1433395355000,
    "note": null,
    "user": null,
    "orderdetails": null,
    "username": "王五",
    "sex": "2",
    "address": null
  },
  {
    "id": 9,
    "userid": null,
    "number": "1000011",
    "createTime": 1436332961000,
    "note": null,
    "user": null,
    "orderdetails": null,
    "username": "王五",
    "sex": "2",
    "address": null
  },
  {
    "id": 10,
    "userid": null,
    "number": "1000012",
    "createTime": 1437113603000,
    "note": null,
    "user": null,
    "orderdetails": null,
    "username": "张三",
    "sex": "1",
    "address": "北京市"
  },
  {
    "id": 11,
    "userid": null,
    "number": "1000012",
    "createTime": 1437041603000,
    "note": null,
    "user": null,
    "orderdetails": null,
    "username": "张小明",
    "sex": "1",
    "address": "河南郑州"
  },
  {
    "id": 12,
    "userid": null,
    "number": "1000012",
    "createTime": 1436958803000,
    "note": null,
    "user": null,
    "orderdetails": null,
    "username": "陈小明",
    "sex": "1",
    "address": "河南郑州"
  },
  {
    "id": 13,
    "userid": null,
    "number": "1000012",
    "createTime": 1436865203000,
    "note": null,
    "user": null,
    "orderdetails": null,
    "username": "张三丰",
    "sex": "1",
    "address": "河南郑州"
  },
  {
    "id": 14,
    "userid": null,
    "number": "1000012",
    "createTime": 1436775203000,
    "note": null,
    "user": null,
    "orderdetails": null,
    "username": "陈小明",
    "sex": "1",
    "address": "河南郑州"
  }
]



请求：http://localhost:8082/users/userOrders
方式：GET
返回：[
  {
    "id": 8,
    "userid": 1,
    "number": "1000010",
    "createTime": 1433395355000,
    "note": null,
    "user": {
      "id": 1,
      "userName": "王五",
      "sex": "2",
      "address": null,
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": null
  },
  {
    "id": 9,
    "userid": 1,
    "number": "1000011",
    "createTime": 1436332961000,
    "note": null,
    "user": {
      "id": 1,
      "userName": "王五",
      "sex": "2",
      "address": null,
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": null
  },
  {
    "id": 10,
    "userid": 2,
    "number": "1000012",
    "createTime": 1437113603000,
    "note": null,
    "user": {
      "id": 2,
      "userName": "张三",
      "sex": "1",
      "address": "北京市",
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": null
  },
  {
    "id": 11,
    "userid": 3,
    "number": "1000012",
    "createTime": 1437041603000,
    "note": null,
    "user": {
      "id": 3,
      "userName": "张小明",
      "sex": "1",
      "address": "河南郑州",
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": null
  },
  {
    "id": 12,
    "userid": 4,
    "number": "1000012",
    "createTime": 1436958803000,
    "note": null,
    "user": {
      "id": 4,
      "userName": "陈小明",
      "sex": "1",
      "address": "河南郑州",
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": null
  },
  {
    "id": 13,
    "userid": 5,
    "number": "1000012",
    "createTime": 1436865203000,
    "note": null,
    "user": {
      "id": 5,
      "userName": "张三丰",
      "sex": "1",
      "address": "河南郑州",
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": null
  },
  {
    "id": 14,
    "userid": 6,
    "number": "1000012",
    "createTime": 1436775203000,
    "note": null,
    "user": {
      "id": 6,
      "userName": "陈小明",
      "sex": "1",
      "address": "河南郑州",
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": null
  }
]



请求：http://localhost:8082/users/userAndOrders
方式：GET
返回：[
  {
    "id": 8,
    "userid": 1,
    "number": "1000010",
    "createTime": 1433395355000,
    "note": null,
    "user": {
      "id": 1,
      "userName": "王五",
      "sex": "2",
      "address": null,
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": [
      {
        "id": 1,
        "ordersId": 8,
        "itemsId": 1,
        "itemsNum": 1,
        "items": null
      }
    ]
  },
  {
    "id": 9,
    "userid": 1,
    "number": "1000011",
    "createTime": 1436332961000,
    "note": null,
    "user": {
      "id": 1,
      "userName": "王五",
      "sex": "2",
      "address": null,
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": [
      {
        "id": 2,
        "ordersId": 9,
        "itemsId": 2,
        "itemsNum": 2,
        "items": null
      }
    ]
  },
  {
    "id": 10,
    "userid": 2,
    "number": "1000012",
    "createTime": 1437113603000,
    "note": null,
    "user": {
      "id": 2,
      "userName": "张三",
      "sex": "1",
      "address": "北京市",
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": [
      {
        "id": 3,
        "ordersId": 10,
        "itemsId": 3,
        "itemsNum": 3,
        "items": null
      }
    ]
  },
  {
    "id": 12,
    "userid": 4,
    "number": "1000012",
    "createTime": 1436958803000,
    "note": null,
    "user": {
      "id": 4,
      "userName": "陈小明",
      "sex": "1",
      "address": "河南郑州",
      "birthday": null,
      "ordersList": null
    },
    "orderdetails": [
      {
        "id": 4,
        "ordersId": 12,
        "itemsId": 2,
        "itemsNum": 4,
        "items": null
      }
    ]
  }
]



请求：http://localhost:8082/users/userAndOrdersItems
方式：GET
返回：[
  {
    "id": 1,
    "userName": "王五",
    "sex": "2",
    "address": null,
    "birthday": null,
    "ordersList": [
      {
        "id": 8,
        "userid": 1,
        "number": "1000010",
        "createTime": 1433395355000,
        "note": null,
        "user": null,
        "orderdetails": [
          {
            "id": 1,
            "ordersId": 8,
            "itemsId": 1,
            "itemsNum": 1,
            "items": {
              "id": 1,
              "itemsName": "台式机",
              "price": 3000,
              "detail": "该电脑质量非常好！",
              "picture": null,
              "createTime": null
            }
          }
        ]
      },
      {
        "id": 9,
        "userid": 1,
        "number": "1000011",
        "createTime": 1436332961000,
        "note": null,
        "user": null,
        "orderdetails": [
          {
            "id": 2,
            "ordersId": 9,
            "itemsId": 2,
            "itemsNum": 2,
            "items": {
              "id": 2,
              "itemsName": "笔记本",
              "price": 6000,
              "detail": "笔记本性能好，质量好！",
              "picture": null,
              "createTime": null
            }
          }
        ]
      }
    ]
  },
  {
    "id": 2,
    "userName": "张三",
    "sex": "1",
    "address": "北京市",
    "birthday": null,
    "ordersList": [
      {
        "id": 10,
        "userid": 2,
        "number": "1000012",
        "createTime": 1437113603000,
        "note": null,
        "user": null,
        "orderdetails": [
          {
            "id": 3,
            "ordersId": 10,
            "itemsId": 3,
            "itemsNum": 3,
            "items": {
              "id": 3,
              "itemsName": "背包",
              "price": 200,
              "detail": "名牌背包，容量大质量好！",
              "picture": null,
              "createTime": null
            }
          }
        ]
      }
    ]
  },
  {
    "id": 4,
    "userName": "陈小明",
    "sex": "1",
    "address": "河南郑州",
    "birthday": null,
    "ordersList": [
      {
        "id": 12,
        "userid": 4,
        "number": "1000012",
        "createTime": 1436958803000,
        "note": null,
        "user": null,
        "orderdetails": [
          {
            "id": 4,
            "ordersId": 12,
            "itemsId": 2,
            "itemsNum": 4,
            "items": {
              "id": 2,
              "itemsName": "笔记本",
              "price": 6000,
              "detail": "笔记本性能好，质量好！",
              "picture": null,
              "createTime": null
            }
          }
        ]
      }
    ]
  }
]

