#!/usr/bin/env python
# coding: utf-8

# In[57]:


#Missoin_1.  구구단프로그램을 작성해주세요. 단을 입력하면 입력받은 단까지 모두 출력해주세요.

a = int(input()) # 단 입력

for b in range(2, a + 1): # 2단부터  a값 까지 반복
    for c in range(1,10): 
        print("{} x {} = {}".format(b, c, b * c))
    print() 


# In[19]:


#Missoin_2.  20개의 정수를 입력 받아서 짝수와 홀수를 구분하여 저장해주세요. 
#           저장된 수의 총합이 얼마인지와 짝수의 합이 큰지 홀수의 합이 큰지를 알려주는 코드를 작성해주세요 




# In[45]:


#Mission_3. 오늘의 기분을 입력받아서 입력한 기분 값이 10를 넘으면 그 기분에 맞는 내용을 알려주는 코드를 작성해주세요.

a = input('오늘의 기분값을 알려주세요:: ')

happy = 21
good =10
notgood = 7
notbad = 5
bad =0

if int(a) >= 10 :
    print('오늘은 대체적으로 기분 좋은 하루가 예상됩니다.')

else:
    print('오늘은 그럭저럭한 하루가 되겠군요.')



# In[ ]:


#Mission_5. 아래의 Song의 내용을 분석할 수 있는 코드를 작성하여 정략적 수치를 통해 의견을 작성해주세요..

# [의견 작성]
#


song = """Fuck you and your mom and your sister and your job and your broke ass car and that shit you call art
       fuck you And your friends that i'll never see again everybody but your dog you can all FUCK OFF i swear i meant to mean the best when it ended even try to bite my tongue when you start shit
       now you're texting all my friends asking questions hey never even liked you in the first place"""



# In[79]:


#Mission_4. 아래의 코드를 보고 입력받은 5개의 성적을 기준을 작성하여 코드를 완성해주세요..
#           단, 아래의 코드는 변경이 불가능합니다.
scores = []

for i in range(5) :
    score = int(input("성적을 입력해주세요 : "))
    scores.append(score)    # 리스트 만들어서 입력한 값 넣기

mx_score =  max(scores)    # 높은점수 구하기
min_score = min(scores)     # 낮은점수 구하기

mx_index = scores.index(mx_score) + 1 #높은점수 잇는 인덱스 번호 구하기
min_index = scores.index(min_score) + 1 #낮은점수 있는 인덱스 번호 구하기

print( "입력한 성적중 "+ str(mx_index) + "번째 점수가 가장 높은 "+ str(mx_score) + "입니다.")
print( "입력한 성적중 "+ str(min_index) + "번째 점수가 가장 낮은 "+ str(min_score) + "입니다.")
# 입력한 성적중 #번째 점수가 가장 높은 #점입니다.


# In[ ]:


#Mission_6. 이름과 점수를 입력하면 학점을 반환하여 저장하는 코드를 작성해주세요.



# In[ ]:


#Mission_7. 피보나치수열은 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다.
#           수열을 코드로 작성해주세요.


# In[ ]:


#Missoin_8. 아래의 내용을 보고 결과를 출력하는 코드를 작성해주세요.
'''10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
   1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?'''


# In[51]:


#Mission_9. 가위,바위,보 게임을 만들어주세요.. (이긴 횟수를 알려주세요.)
import random

win_count = 0   #이긴횟수 

print('가위 바위 보 게임')
print('가위, 바위, 보 중 하나를 내어 상대를 이기는 게임입니다.')

computer = random.choice(['가위', '바위', '보'])
player = input('가위 바위 보 중 하나를 입력하세요: ')

if computer == '가위':
    print('컴퓨터는 가위를 냈습니다.')
    if player == '가위':
        print('플레이어는 가위를 냈습니다.')
        print('무승부')
    elif player == '바위':
        print('플레이어는 바위를 냈습니다.')
        print('플레이어 승리')   
    elif player == '보':
        print('플레이어는 보를 냈습니다.')
        print('컴퓨터 승리')
elif computer == '바위':
    print('컴퓨터는 바위를 냈습니다.')
    if player == '가위':
        print('플레이어는 가위를 냈습니다.')
        print('컴퓨터 승리')
    elif player == '바위':
        print('플레이어는 바위를 냈습니다.')
        print('무승부')
    elif player == '보':
        print('플레이어는 보를 냈습니다.')
        print('플레이어 승리')
elif computer == '보':
    print('컴퓨터는 보를 냈습니다.')
    if player == '가위':
        print('플레이어는 가위를 냈습니다.')
        print('플레이어 승리')
    elif player == '바위':
        print('플레이어는 바위를 냈습니다.')
        print('컴퓨터 승리') 
    elif player == '보':
        print('플레이어는 보를 냈습니다.')
        print('무승부')
        
print("이긴 횟수 : {}회".format(win_count))
        


# In[62]:


#Mission_10. 커피 자판기의 계산프로그램을 만들려고 합니다.(최대 15잔을 뽑을 수 있어요. 잔당 200원)
#            돈을 값을 입력 받으면 커피를 뽑을 수 있는 잔수와 잔액을 알려주시면 됩니다. 
coffee = 200
max = 15

money = int(input("넣으실 금액을 입력하십시오.:: "))
cup = min(money // coffee, max)

change = money - cup * coffee

have = input("커피를 구매하시겠습니까?(yes/no)::")

if have == "no":
    print('커피 판매를 종료합니다.')
    
else:
    if have == "yes"
        if cup <= max : 
            print("커피 {}잔이 나왔습니다.".format(cup))
            print("잔돈은 {}원 입니다.".format(change))
    
            
    



# In[ ]:





# In[ ]:




