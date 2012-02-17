load godata1.txt

plot(cumsum(godata1(:,2)))

%Subjective
%NFuture = 500
%NTot = 600

t=0:1:50;
a = 100;
b = 0.1;
m=a*(1-exp(-b*t));
plot(t,m)

%a = number of faults found when t = infinity.
%b = scale factor of the fault detection ability.

[a b] = go(godata1(:,2))

%a = 547.5124
%b = 0.0242
t=0:1:75;
%Goel-Okumoto
%NFuture = 458.1553
%NTot = 547.5124

load godata2.txt;

cumsumRes = cumsum(godata2(:,2));

cumsumRes(75)

%Real value
%NFuture = 459
%NTot = 461 (mot 468 på plats 81 i m)

load jmdata1.txt;
plot(cumsum(jmdata1(:,2)),jmdata1(:,1))

%jm subjective 
%NFuture = 230
%NTot = 500

i=0:1:150;
fi = 0.5;
N = 600;
lambda=fi*(N - (i-1));
plot(i,lambda)

%N = Initial number of faults in the program
% fi = per fault failure intensity

[N fi] = jm(jmdata1(:,2))

N = 226.4723
fi = 1.1781e-004
i=0:1:225;
lambda=fi*(N - (i-1));

%Jelinski Moranda
%NTot = 226.4723

N = 226.4723
fi = 1.1781e-004
i=0:1:500;
lambda=fi*(N - (i-1));

plot(i, lambda)

load jmdata2.txt;

plot(cumsum(jmdata2(:,2)),jmdata2(:,1))

%Jelinski Moranda
%Real value
%NFuture = 200
%NTot = 207 (not possible to compare)





