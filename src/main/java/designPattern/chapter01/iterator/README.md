# 반복자 패턴(Iterator Pattern)
## 반복자 패턴의 개요
> Iterator는 무엇인가를 '반복한다'라는 의미이며 반복자라고도 한다.
> - for(int - 0; i < arr.length; i++){...} 에서 i를 하나씩 증가시키면 현재 주목하고 있는 배열의 요소를 차례대로 처리해 간다.
> - 여기서 사용되는 변수 i의 기능을 추상화해서 일반화한 것을 Iterator 패턴이라고 한다.
> - 무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한 것이다.

<hr>
<br>

## 반복자 패턴의 구성원
### Iterator(반복자)의 역할
```
요소를 순서대로 검색해가는 인터페이스(API)를 결정한다.
다음 요소가 존재하는지를 얻기 위해 hasNex() 메소드를, 다음 요소를 얻기 위해 next() 메소드를 사용한다.
```

<br>

### ConcreteIterator(구체적인 반복자)의 역할
```
Iterator가 결정한 인터페이스(API)를 실제로 구현한다.
```

<br>

### Aggregate(집합체)의 역할
```
Iterator 역할을 만들어내는 인터페이스(API)를 결정한다.
```

<br>

### ConcreteAggregate(구체적인 집합체)의 역할
```
Aggregate 역할이 결정한 인터페이스(API)를 실제로 구현한다.
```

<br>

<sup>[(IT-Note 저장소로))]([#contents](https://github.com/InSeong-So/IT-Note/tree/master/chapter06-%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4))</sup>

<hr>
<br>