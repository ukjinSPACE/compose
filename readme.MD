# 구조
```
L backend
    L 소스코드 (제공)
    L Dockerfile 구성
L frontend
    L 소스코드 (제공)
    L Dockerfile 구성
L nginx
    L default.conf (제공) : 프록시 관련 내용    
```

# docker-compose 구조
```
서비스
L database - mysql 이미지 사용(리눅스기반) -> 디비
L server   - java 빌드 -> jdk17기반 구동(리눅스기반)    -> 백엔드 담당, 디비와 통신, 비즈니스로직 처리 
L frontend - nginx기반(리눅스기반) react 빌드 결과 세팅 -> html/css/js 실제 처리 담당
L nginx    - nginx기반(리눅스기반) 단독구성, 프록시 담당, 모든 요청담당 -> web
```

# 도커 컴포즈 구성
```
# 기존 자원 삭제
docker compose down

# 컴포즈 기반 구성 ->docker-compose.yml 읽어서 구성
docker compose up -d
```
