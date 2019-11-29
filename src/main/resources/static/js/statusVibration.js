
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
    data1.push((Math.random()-0.5)*1.5);
}
for (var i = 280; i < 305; i++) {
    xAxisData.push(i);
    data1.push((Math.random()-0.5)*2);
}
for (var i = 305; i < 425; i++) {
    xAxisData.push(i);
    data1.push(Math.random()-0.5);
}
for (var i = 425; i < 465; i++) {
    xAxisData.push(i);
    data1.push((Math.random()-0.5)*1);
}
for (var i = 465; i < 627; i++) {
    xAxisData.push(i);
    data1.push((Math.random()-0.5)*2);
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
        max:10,
        min:-10,
    },
    series: [
        {
            name: '隧道振幅柱状图',
            type: 'bar',
            data: data1,
            animationDelay: function (idx) {
                return idx;
            }
        }
    ],
    animationEasing: 'elasticOut',
    animationDelayUpdate: function (idx) {
        return idx * 5;
    }


};
myChart.setOption(option);
