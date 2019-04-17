cd ..
cd yfshop-dependencies
call mvn deploy

cd ..
cd yfshop-commons
call mvn deploy

cd ..
cd yfshop-commons-domain
call mvn deploy

cd ..
cd yfshop-commons-mapper
call mvn deploy

cd ..
cd yfshop-commons-dubbo
call mvn deploy

cd ..
cd yfshop-static-backend
call mvn deploy

cd ..
cd yfshop-service-user-api
call mvn deploy

cd ..
cd yfshop-service-content-api
call mvn deploy

