
//柱状图
var myChart = echarts.init(document.getElementById('press'));
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
            data: ["2019/11/12 00:00:00", "2019/11/12 03:00:00", "2019/11/12 06:00:00", "2019/11/12 09:00:00", "2019/11/12 12:00:00", "2019/11/12 15:00:00", "2019/11/12 18:00:00", "2019/11/12 21:00:00", "2019/11/12 00:00:00"]
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
            data: ["2019/11/12 00:00:00", "2019/11/12 03:00:00", "2019/11/12 06:00:00", "2019/11/12 09:00:00", "2019/11/12 12:00:00", "2019/11/12 15:00:00", "2019/11/12 18:00:00", "2019/11/12 21:00:00", "2019/11/12 00:00:00"]
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
            data: [5.9, 8.5, 7.9, 12.8, 15.8, 17.9, 14.2, 13.7, 10.7, 7.5, 6.2, 5.1]
        },
        {
            name:'通道1-洞壁',
            type:'line',
            smooth: true,
            data: [4.8, 7.8, 8.2, 11.8, 16.8, 18.9, 16.2, 14.7, 9.7, 7.5, 5.2, 4.1]
        }
    ]
};

myChart.setOption(option);
