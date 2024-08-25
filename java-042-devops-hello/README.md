cd C:\Users\YOUR_PC_NAME\Documents\workspace\java-se-course\java-042-devops-hello


docker build  --build-arg  JAR_FILE=build/libs/java-042-devops-hello-1.0.0.jar -t  mimaraslan/java-042-devops-hello:v001 .

docker build  --build-arg  JAR_FILE=target/java-042-devops-hello-1.0.0.jar -t  mimaraslan/java-042-devops-hello:v001 .

docker pull mimaraslan/java-042-devops-hello:v001



docker build  --build-arg  JAR_FILE=target/java-042-devops-hello-1.0.1.jar -t  mimaraslan/java-042-devops-hello:v002 .

docker pull mimaraslan/java-042-devops-hello:v002


docker build  --build-arg  JAR_FILE=target/java-042-devops-hello-1.0.1.jar -t  mimaraslan/java-042-devops-hello:latest .

docker pull mimaraslan/java-042-devops-hello:latest

docker pull mimaraslan/java-042-devops-hello



docker pull postgres

docker run     -p 9999:5432     --name my-postgres -e POSTGRES_PASSWORD=123456789 -d postgres
docker run     -p 9992:5432     --name my-postgres2 -e POSTGRES_PASSWORD=123456789 -d postgres


docker pull mysql

docker run   -p 9090:3306    --name my-mysql   -e MYSQL_ROOT_PASSWORD=123456789  -d  mysql:latest

docker run   -p 9091:3306    --name my-mysql2   -e MYSQL_ROOT_PASSWORD=123456789  -d  mysql:latest





gcloud auth login

gcloud components install gke-gcloud-auth-plugin


kubectl get nodes


DockerHub'dan image'i çekip Kubernetes içinde container'a çevirip Pod içine koyacak.

kubectl run  mypod   --image=mimaraslan/java-042-devops-hello:latest




kubectl get pod

kubectl get po

kubectl get pods





kubectl config get-contexts



kubectl run  mypod1   --image=mimaraslan/java-042-devops-hello:v001

kubectl run  mypod2   --image=mimaraslan/java-042-devops-hello:v002

kubectl run  mypod3   --image=mimaraslan/java-042-devops-hello:v002

kubectl run  mypod4   --image=mimaraslan/java-042-devops-hello:v002

kubectl run  mypod5   --image=mimaraslan/java-042-devops-hello

kubectl get pods -o wide

kubectl describe pod mypod5


kubectl delete pod mypod1
kubectl delete pod mypod2
kubectl delete pod mypod3
kubectl delete pod mypod4
kubectl delete pod mypod5



kubectl run  mypod1   --image=mimaraslan/java-042-devops-hello:latest
kubectl run  mypod2   --image=mimaraslan/java-042-devops-hello:v002
kubectl run  mypod3   --image=mimaraslan/java-042-devops-hello:v001
kubectl run  mypod4   --image=mimaraslan/java-042-devops-hello:v008
kubectl run  mypod5   --image=mimaraslan/java-042-devops-hello

kubectl delete pod mypod5


kubectl run  mypod6   --image=postgres

kubectl run  mypod7   --image=mysql

kubectl run  mypod8   --image=mimaraslan/java-042-devops-hello:v008
