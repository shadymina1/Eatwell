#include <jni.h>
#include <string>
#include <time.h>
#include <stdlib.h>

using namespace std;

extern "C" JNIEXPORT jstring JNICALL
Java_com_shady_finalc_MainActivity3_bad(
        JNIEnv* env,
        jobject /* this */) {
    srand ( time(NULL) ); //initialize the random seed
    const string arrayNum[4] = {"OMG!", "No no noooo!!", "Why did you do it !!", "Think again about it!"};
    int RandIndex = rand() % 4; //generates a random number between 0 and 3
    string negative =  arrayNum[RandIndex];
    return env->NewStringUTF(negative.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_shady_finalc_MainActivity3_good(
        JNIEnv* env,
        jobject /* this */) {
    srand ( time(NULL) ); //initialize the random seed
    const string arrayNum[6] = {"Yesss!","Woooow!","Impressive", "That is smart!!", "You are the one!!", "Good choice!"};
    int RandIndex = rand() % 6; //generates a random number between 0 and 5
    string positive =  arrayNum[RandIndex];
    return env->NewStringUTF(positive.c_str());
}

extern "C" JNIEXPORT jstring
Java_com_shady_finalc_MainActivity4_spin(
        JNIEnv* env,
        jobject /* this */) {
    srand ( time(NULL) );
    const string arrayNum[6] = {"Congratulations! , you won !! .. your food is for free today !!, see you next time !!","Hmm, next time you will win, for now , our waiter/waitress will come your table for the payment!","Hmmm next time you will win, for now , our waiter/waitress will come your table for the payment!", "next time you will win, for now , our waiter/waitress will come your table for the payment!", "Hmmm next time you will win, for now , our waiter/waitress will come your table for the payment!", "Hmmm next time you will win, for now , our waiter/waitress will come your table for the payment!"};
    int RandIndex = rand() % 6; //generates a random number between 0 and 5
    string isWin =  arrayNum[RandIndex];
    return env->NewStringUTF(isWin.c_str());
}