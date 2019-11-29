
//速度仪表
var myChartV = echarts.init(document.getElementById('subwayV'));
optionV = {
    tooltip : {
        formatter: "{a} <br/>{b} : {c}%"
    },
    toolbox: {
        feature: {
            restore: {},
            saveAsImage: {}
        }
    },

    series: [
        {
            name: '速度',
            type: 'gauge',
            center: ["50%", "50%"], // 仪表位置
            radius: "80%", //仪表大小
            startAngle: 220, //开始角度
            endAngle: -40, //结束角度
            axisLine : {
                show : true,
                lineStyle : { // 属性lineStyle控制线条样式
                     width : 20//表盘宽度
                  }
            },
            textStyle: {
                color: '#5bdbff',
                fontSize: 20,
                offsetCenter: [0, '80%']
            },
            itemStyle:{//指针样式
                normal:{
                    color:'#1ed133'
                }
            },
            pointer:{//指针长度与宽度
                width:3,
                length:'85%'
            },
            splitLine : { //分割线样式（及10、20等长线样式）
            length : 30,
                    lineStyle : { // 属性lineStyle控制线条样式
                       width : 2
                   }
            },
            axisLabel : { //文字样式（及“10”、“20”等文字样式）
                color : "black",
                distance : 0 //文字离表盘的距离
            },
            detail: {
                formatter:'{value}km/h',
                textStyle:{
                    "fontSize": 15,
                },
                offsetCenter: [0,"70%"]
            },
            data: [{
                value: 62,
            }]
        }
    ]
};
myChartV.setOption(optionV);


//单点波形图
var myChartS = echarts.init(document.getElementById('singlePoint'));
var data2 = [];
var xAxisData2 = [];
for (var i = 0; i < 300; i++) {
    xAxisData2.push(i);
    data2.push(Math.random()-0.5);
}
for (var i = 300; i < 450; i++) {
    xAxisData2.push(i);
    data2.push((Math.random()-0.5)*4);
}
for (var i = 450; i < 1328; i++) {
    xAxisData2.push(i);
    data2.push(Math.random()-0.5);
}


    myChartS.setOption(option = {
        title: {
            text: '单点波形图',
            x: 'center',
            y: -5
        },
        tooltip: {
            trigger: 'axis'
        },
        xAxis: {
            data: xAxisData2
        },
        yAxis: {
            splitLine: {
                show: false
            }
        },
        toolbox: {
            right: 80,
            top: -10,
            feature: {
                dataZoom: {
                    yAxisIndex: '20'
                },
                restore: {},
                saveAsImage: {}
            }
        },
        dataZoom: [{
            startValue: '2014-06-01'
        }, {
            type: 'inside'
        }],
        grid: {
            top: '8%',
            left: '2%',
            right: '10%',
            bottom: '2%',
            containLabel: true
        },
        series: {
            name: 'SinglePoint',
            type: 'line',
            data: data2,
            itemStyle: {
                normal: {
                    lineStyle: {
                        width:0.5
                    }
                }
            },
        }
    });







//柱状图
var myChart = echarts.init(document.getElementById('main'));
// 绘制图表
function random(lower, upper) {
    return Math.random()* upper-lower;
}

var xAxisData = [];
var data1 = [];
for (var i = 0; i < 280; i++) {
    xAxisData.push(i);
    data1.push(Math.random()-0.5);
}
for (var i = 280; i < 305; i++) {
    xAxisData.push(i);
    data1.push(Math.random()*1);
}
for (var i = 305; i < 345; i++) {
    xAxisData.push(i);
    data1.push(Math.random()*3+1);
}
for (var i = 345; i < 385; i++) {
    xAxisData.push(i);
    data1.push(Math.random()*5+3);
}
for (var i = 385; i < 425; i++) {
    xAxisData.push(i);
    data1.push(Math.random()*4+1);
}
for (var i = 425; i < 465; i++) {
    xAxisData.push(i);
    data1.push(Math.random()*1);
}
for (var i = 465; i < 1328; i++) {
    xAxisData.push(i);
    data1.push(Math.random()-0.5);
}


option = {
    toolbox: {
        feature: {
            magicType: {
                type: ['stack', 'tiled']
            },
            dataView: {},
            saveAsImage: {
                pixelRatio: 2
            }
        }
    },
    grid: {
        top: '4%',
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    tooltip: {},
    xAxis: {
        data: xAxisData,
        silent: false,
        splitLine: {
            show: false
        },
        position: 'bottom',  // x轴的位置
        name: '位置编号',    // 轴名称
        nameGap: 15, // 坐标轴名称与轴线之间的距离
        axisTick: {    // 坐标轴 刻度
            show: true,  // 是否显示
            inside: true,  // 是否朝内
            length: 1,     // 长度
            lineStyle: {   // 默认取轴线的样式
                color: 'red',
                width: 1,
                type: 'solid'
            }
        },
        axisLine: {       // 坐标轴 轴线
            show: true,  // 是否显示
            symbol: ['none', 'arrow'],  // 是否显示轴线箭头
            symbolSize: [8, 8], // 箭头大小
            symbolOffset: [0, 7],  // 箭头位置
            lineStyle: {
                width: 1,
                type: 'solid'
            }
        },
        axisLabel: {    // 坐标轴标签
            show: true,  // 是否显示
            inside: false, // 是否朝内
            rotate: 0, // 旋转角度
            margin: 2, // 刻度标签与轴线之间的距离
        },
    },
    yAxis: {
        name: '振幅',   // 轴名称
    },
    series: [{
        name: '隧道振幅柱状图',
        type: 'bar',
        data: data1,
        animationDelay: function (idx) {
            return idx;
        }
    }],
    animationEasing: 'elasticOut',
    animationDelayUpdate: function (idx) {
        return idx * 5;
    }


};
myChart.setOption(option);
