
//柱状图
var myChart = echarts.init(document.getElementById('damping'));
var colors = ['#5793f3', '#d14a61', '#675bba'];

option = {
    color: colors,

    tooltip: {
        trigger: 'none',
        axisPointer: {
            type: 'cross'
        }
    },
    legend: {
        data:['通道0-道轨', '通道1-洞壁']
    },
    grid: {
        top: 70,
        bottom: 50,
        left:50,
        right:50
    },
    xAxis: [
        {
            type: 'category',
            axisTick: {
                alignWithLabel: true
            },
            axisLine: {
                onZero: false,
                lineStyle: {
                    color: colors[1]
                }
            },
            axisPointer: {
                label: {
                    formatter: function (params) {
                        return '通道0-道轨  ' + params.value
                            + (params.seriesData.length ? '：' + params.seriesData[0].data : '');
                    }
                }
            },
            data: ["2019/11/01", "2019/11/02", "2019/11/03", "2019/11/04", "2019/11/05", "2019/11/06", "2019/11/07", "2019/11/08", "2019/11/09", "2019/11/10", "2019/11/11", "2019/11/12"]
        },
        {
            type: 'category',
            axisTick: {
                alignWithLabel: true
            },
            axisLine: {
                onZero: false,
                lineStyle: {
                    color: colors[0]
                }
            },
            axisPointer: {
                label: {
                    formatter: function (params) {
                        return '通道1-洞壁  ' + params.value
                            + (params.seriesData.length ? '：' + params.seriesData[0].data : '');
                    }
                }
            },
            data: ["2019/11/01", "2019/11/02", "2019/11/03", "2019/11/04", "2019/11/05", "2019/11/06", "2019/11/07", "2019/11/08", "2019/11/09", "2019/11/10", "2019/11/11", "2019/11/12"]
        }
    ],
    yAxis: [
        {
            type: 'value'
        }
    ],
    series: [
        {
            name:'通道0-道轨',
            type:'line',
            xAxisIndex: 1,
            smooth: true,
            data: [0.56, 3.5, 1.21, 0.84, 1.25, 2.10, 2.14, 3.25, 3.89, 3.25, 0.01, 0.25]
        },
        {
            name:'通道1-洞壁',
            type:'line',
            smooth: true,
            data: [0.36, 2.1, 2.21, 1.84, 2.25, 2.50, 2.84, 3.15, 3.39, 2.25, 1.01, 0.35]
        }
    ]
};

myChart.setOption(option);
