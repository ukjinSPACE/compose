# 멀티 스테이지
# 스테이지 1 -> 빌드,  node 이미지를 사용
FROM node:22 AS builder

# 작업 디렉토리
WORKDIR /app

# 빌드를 위해 원소스 카피
# node_modules 제외 -> .dockerignore 파일 체크
COPY . .

# 라이브러리 설치
RUN npm install

# 빌드 -> /app/build
RUN npm run build

# 스테이지 2 -> 서비스, nginx 이미지를 사용, 빌드 결과를 넣어서 구동
FROM nginx:alpine

# 빌드된 결과물 카피(html, css, js, 리소스(이미지등등))\
# nginx 의 루트 디렉토리로 이동(nginx  이미지별로 경로가 상이할수 있음) -> 확인필요
COPY --from=builder /app/build /usr/share/nginx/html

# 포트
EXPOSE 80

# 컨테이너 가동
CMD ["nginx","-g","daemon off;"]