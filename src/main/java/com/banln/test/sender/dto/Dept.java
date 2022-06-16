package com.banln.test.sender.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
//    Integer deptNo;
//    String dName;
//    String loc;
//    String time;

    private String exchn_cd; //거래소 구분 코드
    private String market; //종목 구분 코드
    private String trade_date; //	최근 거래 일자(UTC)
    private String trade_time; //	최근 거래 시각(UTC)	String
    private String trade_date_kst; //	최근 거래 일자(KST)	String
    private String trade_time_kst; //	최근 거래 시각(KST)	String
    //	private BigDecimal opening_price; //	시가	Double
    private double opening_price; //	시가	Double
    private double high_price; //	고가	Double
    private double low_price; //	저가	Double
    private double trade_price; //	종가	Double
    private double prev_closing_price; //	전일 종가	Double
    private String change; //	EVEN : 보합 	RISE : 상승 	FALL : 하락	String
    private double change_price; //	변화액의 절대값	Double
    private double change_rate; //	변화율의 절대값	Double
    private double signed_change_price; //	부호가 있는 변화액	Double
    private double signed_change_rate; //	부호가 있는 변화율	Double
    private double trade_volume; //	가장 최근 거래량	Double
    private double acc_trade_price; //	누적 거래대금(UTC 0시 기준)	Double
    private double acc_trade_price_24h; //	24시간 누적 거래대금	Double
    private double acc_trade_volume; //	누적 거래량(UTC 0시 기준)	Double
    private double acc_trade_volume_24h; //	24시간 누적 거래량	Double
    private double highest_52_week_price; //	52주 신고가	Double
    private String highest_52_week_date; //	52주 신고가 달성일	String
    private double lowest_52_week_price; //	52주 신저가	Double
    private String lowest_52_week_date; //	52주 신저가 달성일	String
    private long timestamp; //	타임스탬프	Long

}
