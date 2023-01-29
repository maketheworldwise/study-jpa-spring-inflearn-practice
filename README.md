# 자바 ORM 표준 JPA 프로그래밍 실전 예제

> 이 프로젝트는 [김영한님의 자바 ORM 표준 JPA 프로그래밍 강의](https://www.inflearn.com/course/ORM-JPA-Basic
)의 실전 예제를 기반으로 진행되었습니다.

## 🌴 브랜치

- main : 완성된 프로젝트
- init : 초기 프로젝트 구조
- practice-example-1 : 실전 예제 1 - 요구사항 분석과 기본 매핑
- practice-example-2 : 실전 예제 2 - 연관관계 매핑 시작
- practice-example-3 : 실전 예제 3 - 다양한 연관관계 매핑
- practice-example-4 : 실전 예제 4 - 상속관계 매핑
- practice-example-5 : 실전 예제 5 - 연관관계 관리
- practice-example-6 : 실전 예제 6 - 값 타입 매핑

## 🚀 요구 사항

- 회원은 상품을 주문할 수 있다.
- 주문 시 여러 종류의 상품을 선택할 수 있다.
- 상품의 종류는 음반, 도서, 영화가 있고 이후 더 확장될 수 있다.
- 모든 데이터는 등록일과 수정일이 필수다.

## 🚀 기능 목록

- 회원 기능
  - 회원 등록
  - 회원 조회
- 상품 기능
  - 상품 등록
  - 상품 수정
  - 상품 조회
- 주문 기능
  - 상품 주문
  - 주문내역 조회
  - 주문 취소
- 배송 기능
- 카테고리 기능

## 🚀 도메인 관계

- 회원:주문
  - 회원은 여러번 주문할 수 있다.
- 주문:상품
  - 주문할 때 여러 상품을 선택할 수 있다.
  - 상품도 여러 번 주문될 수 있다.
- 주문:배송
  - 주문과 배송은 1:1
- 상품:카테고리
  - 상품과 카테고리는 N:M