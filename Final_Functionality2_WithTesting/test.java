import functions.Function2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
/*

The size of8757
[------------------------------------
Shop Id is6228
Shop code is'56168
Shope Name is'SB 148 ST FS 24 AVE
Shop description'148 ST @ 24 AVE
The latitude of Shop is  49.045155
The longitude of Shop is  -122.812446
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6072
Shop code is'56014
Shope Name is'NB 144 ST FS 60 AVE
Shop description'144 ST @ 60 AVE
The latitude of Shop is  49.112340
The longitude of Shop is  -122.823271
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6073
Shop code is'56015
Shope Name is'NB 144 ST FS 64 AVE
Shop description'144 ST @ 64 AVE
The latitude of Shop is  49.119844
The longitude of Shop is  -122.823154
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6074
Shop code is'56016
Shope Name is'NB 144 ST FS 66 AVE
Shop description'144 ST @ 66 AVE
The latitude of Shop is  49.123116
The longitude of Shop is  -122.823213
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2632
Shop code is'52607
Shope Name is'EB 14 AVE FS GRIFFITHS DR
Shop description'14 AVE @ GRIFFITHS DR
The latitude of Shop is  49.210398
The longitude of Shop is  -122.953167
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5774
Shop code is'55719
Shope Name is'SB 140 ST FS 100 AVE
Shop description'140 ST @ 100 AVE
The latitude of Shop is  49.183844
The longitude of Shop is  -122.834339
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is8356
Shop code is'58574
Shope Name is'NB 144 ST AT 6200 BLOCK
Shop description'144 ST @ 6200 BLOCK
The latitude of Shop is  49.116245
The longitude of Shop is  -122.823181
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6068
Shop code is'56010
Shope Name is'SB 148 ST FS FRASER HWY
Shop description'148 ST @ FRASER HWY
The latitude of Shop is  49.169991
The longitude of Shop is  -122.812435
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6058
Shop code is'56000
Shope Name is'SB 142 ST FS 60 AVE
Shop description'142 ST @ 60 AVE
The latitude of Shop is  49.111388
The longitude of Shop is  -122.828904
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5756
Shop code is'55701
Shope Name is'NB 140 ST FS 88 AVE
Shop description'140 ST @ 88 AVE
The latitude of Shop is  49.163216
The longitude of Shop is  -122.834507
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6016
Shop code is'55959
Shope Name is'SB 144 ST FS 70A AVE
Shop description'144 ST @ 70A AVE
The latitude of Shop is  49.130624
The longitude of Shop is  -122.823422
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2634
Shop code is'52609
Shope Name is'WB 14 AVE FS 15 ST
Shop description'14 AVE @ 15 ST
The latitude of Shop is  49.213919
The longitude of Shop is  -122.948115
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5750
Shop code is'55695
Shope Name is'NB 140 ST FS 80 AVE
Shop description'140 ST @ 80 AVE
The latitude of Shop is  49.148441
The longitude of Shop is  -122.834454
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2654
Shop code is'52629
Shope Name is'EB 14 AVE FS 15 ST
Shop description'14 AVE @ 15 ST
The latitude of Shop is  49.214391
The longitude of Shop is  -122.946489
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5752
Shop code is'55697
Shope Name is'NB 140 ST FS 82 AVE
Shop description'140 ST @ 82 AVE
The latitude of Shop is  49.153059
The longitude of Shop is  -122.834461
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6352
Shop code is'56292
Shope Name is'SB 148 ST FS 18A AVE
Shop description'148 ST @ 18A AVE
The latitude of Shop is  49.034916
The longitude of Shop is  -122.812351
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5753
Shop code is'55698
Shope Name is'NB 140 ST FS 84 AVE
Shop description'140 ST @ 84 AVE
The latitude of Shop is  49.155881
The longitude of Shop is  -122.834487
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5760
Shop code is'55705
Shope Name is'NB 140 ST FS 94A AVE
Shop description'140 ST @ 94A AVE
The latitude of Shop is  49.174994
The longitude of Shop is  -122.834390
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5942
Shop code is'55886
Shope Name is'NB 144 ST NS 79 AVE
Shop description'144 ST @ 79 AVE
The latitude of Shop is  49.145773
The longitude of Shop is  -122.823320
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is11692
Shop code is'61624
Shope Name is'SB 144 ST FS 68B AVE
Shop description'144 ST @ 68B AVE
The latitude of Shop is  49.127257
The longitude of Shop is  -122.823409
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5790
Shop code is'55735
Shope Name is'SB 140 ST FS 77 AVE
Shop description'140 ST @ 77 AVE
The latitude of Shop is  49.142373
The longitude of Shop is  -122.834650
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6071
Shop code is'56013
Shope Name is'NB 144 ST FS 57 AVE
Shop description'144 ST @ 57 AVE
The latitude of Shop is  49.106828
The longitude of Shop is  -122.823251
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is8565
Shop code is'58248
Shope Name is'SB 140 ST FS 75 AVE
Shop description'140 ST @ 75 AVE
The latitude of Shop is  49.138630
The longitude of Shop is  -122.834605
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5933
Shop code is'55877
Shope Name is'SB 144 ST FS 74A AVE
Shop description'144 ST @ 74A AVE
The latitude of Shop is  49.137874
The longitude of Shop is  -122.823467
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5787
Shop code is'55732
Shope Name is'SB 140 ST FS 80 AVE
Shop description'140 ST @ 80 AVE
The latitude of Shop is  49.147770
The longitude of Shop is  -122.834671
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5786
Shop code is'55731
Shope Name is'SB 140 ST FS BEAR CREEK DR
Shop description'140 ST @ BEAR CREEK DR
The latitude of Shop is  49.150585
The longitude of Shop is  -122.834691
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2655
Shop code is'52630
Shope Name is'WB 14 AVE AT 7100 BLOCK
Shop description'14 AVE @ 7100 BLOCK
The latitude of Shop is  49.212337
The longitude of Shop is  -122.951051
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6234
Shop code is'56174
Shope Name is'NB 144 ST FS 18 AVE
Shop description'144 ST @ 18 AVE
The latitude of Shop is  49.035039
The longitude of Shop is  -122.823218
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5940
Shop code is'55884
Shope Name is'NB 144 ST FS 76 AVE
Shop description'144 ST @ 76 AVE
The latitude of Shop is  49.141375
The longitude of Shop is  -122.823279
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5931
Shop code is'55875
Shope Name is'SB 144 ST FS 77A AVE
Shop description'144 ST @ 77A AVE
The latitude of Shop is  49.142924
The longitude of Shop is  -122.823480
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5957
Shop code is'55901
Shope Name is'SB 148 ST FS SPENSER DR
Shop description'148 ST @ SPENSER DR
The latitude of Shop is  49.157620
The longitude of Shop is  -122.812520
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5938
Shop code is'55882
Shope Name is'NB 144 ST FS 72 AVE
Shop description'144 ST @ 72 AVE
The latitude of Shop is  49.134162
The longitude of Shop is  -122.823215
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5773
Shop code is'55718
Shope Name is'SB 140 ST NS 100A AVE
Shop description'140 ST @ 100A AVE
The latitude of Shop is  49.185740
The longitude of Shop is  -122.834281
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5785
Shop code is'55730
Shope Name is'SB 140 ST AT 8300 BLOCK
Shop description'140 ST @ 8300 BLOCK
The latitude of Shop is  49.153486
The longitude of Shop is  -122.834726
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5749
Shop code is'55694
Shope Name is'NB 140 ST FS 78 AVE
Shop description'140 ST @ 78 AVE
The latitude of Shop is  49.144987
The longitude of Shop is  -122.834423
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6233
Shop code is'56173
Shope Name is'NB 144 ST NS 16A AVE
Shop description'144 ST @ 16A AVE
The latitude of Shop is  49.031821
The longitude of Shop is  -122.823198
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6343
Shop code is'56283
Shope Name is'NB 148 ST FS 16 AVE
Shop description'148 ST @ 16 AVE
The latitude of Shop is  49.031583
The longitude of Shop is  -122.812097
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6066
Shop code is'56008
Shope Name is'SB 148 ST FS 96 AVE
Shop description'148 ST @ 96 AVE
The latitude of Shop is  49.176413
The longitude of Shop is  -122.812367
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5776
Shop code is'55721
Shope Name is'SB 140 ST FS FRASER HWY
Shop description'140 ST @ FRASER HWY
The latitude of Shop is  49.178386
The longitude of Shop is  -122.834633
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5188
Shop code is'55136
Shope Name is'NB 148 ST FS 108 AVE
Shop description'148 ST @ 108 AVE
The latitude of Shop is  49.199256
The longitude of Shop is  -122.812411
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6020
Shop code is'55963
Shope Name is'SB 144 ST FS 60 AVE
Shop description'144 ST @ 60 AVE
The latitude of Shop is  49.111368
The longitude of Shop is  -122.823478
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5175
Shop code is'55123
Shope Name is'SB 148 ST FS 110 AVE
Shop description'148 ST @ 110 AVE
The latitude of Shop is  49.201973
The longitude of Shop is  -122.812702
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5746
Shop code is'55691
Shope Name is'NB 140 ST FS 74 AVE
Shop description'140 ST @ 74 AVE
The latitude of Shop is  49.137512
The longitude of Shop is  -122.834374
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5953
Shop code is'55897
Shope Name is'NB 148 ST AT 86B AVE
Shop description'148 ST @ 86B AVE
The latitude of Shop is  49.160751
The longitude of Shop is  -122.812311
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5754
Shop code is'55699
Shope Name is'NB 140 ST FS 85 AVE
Shop description'140 ST @ 85 AVE
The latitude of Shop is  49.158800
The longitude of Shop is  -122.834513
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5758
Shop code is'55703
Shope Name is'NB 140 ST FS 92 AVE
Shop description'140 ST @ 92 AVE
The latitude of Shop is  49.170408
The longitude of Shop is  -122.834478
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5761
Shop code is'55706
Shope Name is'NB 140 ST FS 96 AVE
Shop description'140 ST @ 96 AVE
The latitude of Shop is  49.177363
The longitude of Shop is  -122.834395
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5174
Shop code is'55122
Shope Name is'SB 148 ST FS 111A AVE
Shop description'148 ST @ 111A AVE
The latitude of Shop is  49.204826
The longitude of Shop is  -122.812738
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2635
Shop code is'52610
Shope Name is'EB 14 AVE NS KINGSWAY
Shop description'14 AVE @ KINGSWAY
The latitude of Shop is  49.216270
The longitude of Shop is  -122.943021
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5930
Shop code is'55874
Shope Name is'SB 144 ST NS 82 AVE
Shop description'144 ST @ 82 AVE
The latitude of Shop is  49.152751
The longitude of Shop is  -122.823501
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6075
Shop code is'59901
Shope Name is'NB 144 ST FS 68A AVE
Shop description'144 ST @ 68A AVE
The latitude of Shop is  49.127371
The longitude of Shop is  -122.823201
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5755
Shop code is'55700
Shope Name is'NB 140 ST FS 86A AVE
Shop description'140 ST @ 86A AVE
The latitude of Shop is  49.160704
The longitude of Shop is  -122.834515
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6002
Shop code is'55946
Shope Name is'NB 144 ST FS 80 AVE
Shop description'144 ST @ 80 AVE
The latitude of Shop is  49.148486
The longitude of Shop is  -122.823330
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5956
Shop code is'55900
Shope Name is'SB 148 ST FS 86B AVE
Shop description'148 ST @ 86B AVE
The latitude of Shop is  49.160165
The longitude of Shop is  -122.812494
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6009
Shop code is'55953
Shope Name is'NB 148 ST FS 98 AVE
Shop description'148 ST @ 98 AVE
The latitude of Shop is  49.180874
The longitude of Shop is  -122.812038
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5780
Shop code is'55725
Shope Name is'SB 140 ST FS 90 AVE
Shop description'140 ST @ 90 AVE
The latitude of Shop is  49.166042
The longitude of Shop is  -122.834774
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6345
Shop code is'58483
Shope Name is'NB 148 ST FS 18A AVE
Shop description'148 ST @ 18A AVE
The latitude of Shop is  49.036241
The longitude of Shop is  -122.812132
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5775
Shop code is'55720
Shope Name is'SB 140 ST NS GREEN TIMBERS WAY
Shop description'140 ST @ GREEN TIMBERS WAY
The latitude of Shop is  49.181282
The longitude of Shop is  -122.834487
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5778
Shop code is'55723
Shope Name is'SB 140 ST FS 94A AVE
Shop description'140 ST @ 94A AVE
The latitude of Shop is  49.174474
The longitude of Shop is  -122.834676
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6006
Shop code is'55950
Shope Name is'NB 148 ST FS FRASER HWY
Shop description'148 ST @ FRASER HWY
The latitude of Shop is  49.170621
The longitude of Shop is  -122.812183
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6018
Shop code is'55961
Shope Name is'SB 144 ST FS 66 AVE
Shop description'144 ST @ 66 AVE
The latitude of Shop is  49.122403
The longitude of Shop is  -122.823422
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2633
Shop code is'52608
Shope Name is'EB 14 AVE AT 7100 BLOCK
Shop description'14 AVE @ 7100 BLOCK
The latitude of Shop is  49.212611
The longitude of Shop is  -122.950256
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6019
Shop code is'55962
Shope Name is'SB 144 ST FS 64 AVE
Shop description'144 ST @ 64 AVE
The latitude of Shop is  49.118506
The longitude of Shop is  -122.823407
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5189
Shop code is'55137
Shope Name is'NB 148 ST FS 110 AVE
Shop description'148 ST @ 110 AVE
The latitude of Shop is  49.202672
The longitude of Shop is  -122.812520
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5955
Shop code is'55899
Shope Name is'SB 148 ST FS 88 AVE
Shop description'148 ST @ 88 AVE
The latitude of Shop is  49.162385
The longitude of Shop is  -122.812468
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6238
Shop code is'56178
Shope Name is'NB 148 ST FS 24 AVE
Shop description'148 ST @ 24 AVE
The latitude of Shop is  49.046055
The longitude of Shop is  -122.812151
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6239
Shop code is'56179
Shope Name is'NB 148 ST FS 26 AVE
Shop description'148 ST @ 26 AVE
The latitude of Shop is  49.050047
The longitude of Shop is  -122.812141
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2656
Shop code is'52631
Shope Name is'WB 14 AVE NS GRIFFITHS DR
Shop description'14 AVE @ GRIFFITHS DR
The latitude of Shop is  49.210182
The longitude of Shop is  -122.953538
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5939
Shop code is'55883
Shope Name is'NB 144 ST FS 74A AVE
Shop description'144 ST @ 74A AVE
The latitude of Shop is  49.138558
The longitude of Shop is  -122.823288
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6344
Shop code is'58481
Shope Name is'NB 148 ST FS 17 AVE
Shop description'148 ST @ 17 AVE
The latitude of Shop is  49.033669
The longitude of Shop is  -122.812097
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is2653
Shop code is'52628
Shope Name is'WB 14 AVE FS KINGSWAY
Shop description'14 AVE @ KINGSWAY
The latitude of Shop is  49.216171
The longitude of Shop is  -122.943449
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6231
Shop code is'56171
Shope Name is'SB 144 ST NS 19A AVE
Shop description'144 ST @ 19A AVE
The latitude of Shop is  49.037667
The longitude of Shop is  -122.823385
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is11693
Shop code is'61625
Shope Name is'SB 144 ST FS 67A AVE
Shop description'144 ST @ 67A AVE
The latitude of Shop is  49.124838
The longitude of Shop is  -122.823411
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6064
Shop code is'56006
Shope Name is'SB 148 ST FS 100 AVE
Shop description'148 ST @ 100 AVE
The latitude of Shop is  49.183668
The longitude of Shop is  -122.812191
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6015
Shop code is'55958
Shope Name is'SB 144 ST FS 72 AVE
Shop description'144 ST @ 72 AVE
The latitude of Shop is  49.133308
The longitude of Shop is  -122.823442
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5852
Shop code is'55797
Shope Name is'NB 143A ST NS GLADSTONE DR
Shop description'143A ST @ GLADSTONE DR
The latitude of Shop is  49.206441
The longitude of Shop is  -122.825030
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5748
Shop code is'55693
Shope Name is'NB 140 ST NS 77A AVE
Shop description'140 ST @ 77A AVE
The latitude of Shop is  49.143377
The longitude of Shop is  -122.834416
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5784
Shop code is'55729
Shope Name is'SB 140 ST FS 84 AVE
Shop description'140 ST @ 84 AVE
The latitude of Shop is  49.155210
The longitude of Shop is  -122.834727
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5781
Shop code is'55726
Shope Name is'SB 140 ST FS 88 AVE
Shop description'140 ST @ 88 AVE
The latitude of Shop is  49.162433
The longitude of Shop is  -122.834765
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6007
Shop code is'55951
Shope Name is'NB 148 ST FS 94 AVE
Shop description'148 ST @ 94 AVE
The latitude of Shop is  49.173763
The longitude of Shop is  -122.812177
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6008
Shop code is'55952
Shope Name is'NB 148 ST FS 96 AVE
Shop description'148 ST @ 96 AVE
The latitude of Shop is  49.177292
The longitude of Shop is  -122.812115
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6005
Shop code is'55949
Shope Name is'NB 148 ST FS 90 AVE
Shop description'148 ST @ 90 AVE
The latitude of Shop is  49.166755
The longitude of Shop is  -122.812252
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6229
Shop code is'56169
Shope Name is'SB 148 ST NS 21A AVE
Shop description'148 ST @ 21A AVE
The latitude of Shop is  49.041583
The longitude of Shop is  -122.812293
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6023
Shop code is'55966
Shope Name is'NB 142 ST NS 60 AVE
Shop description'142 ST @ 60 AVE
The latitude of Shop is  49.111602
The longitude of Shop is  -122.828776
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6003
Shop code is'55947
Shope Name is'NB 144 ST FS 82A AVE
Shop description'144 ST @ 82A AVE
The latitude of Shop is  49.153359
The longitude of Shop is  -122.823274
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6021
Shop code is'55964
Shope Name is'SB 144 ST NS 57 AVE
Shop description'144 ST @ 57 AVE
The latitude of Shop is  49.106697
The longitude of Shop is  -122.823515
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6353
Shop code is'58482
Shope Name is'SB 148 ST FS 17 AVE
Shop description'148 ST @ 17 AVE
The latitude of Shop is  49.032335
The longitude of Shop is  -122.812296
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5789
Shop code is'55734
Shope Name is'SB 140 ST FS 78A AVE
Shop description'140 ST @ 78A AVE
The latitude of Shop is  49.144964
The longitude of Shop is  -122.834645
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6237
Shop code is'56177
Shope Name is'NB 148 ST FS 21A AVE
Shop description'148 ST @ 21A AVE
The latitude of Shop is  49.040908
The longitude of Shop is  -122.812137
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5932
Shop code is'59084
Shope Name is'SB 144 ST FS 76 AVE
Shop description'144 ST @ 76 AVE
The latitude of Shop is  49.140557
The longitude of Shop is  -122.823514
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5952
Shop code is'55896
Shope Name is'NB 148 ST FS SPENSER DR
Shop description'148 ST @ SPENSER DR
The latitude of Shop is  49.158445
The longitude of Shop is  -122.812332
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5747
Shop code is'55692
Shope Name is'NB 140 ST FS 75 AVE
Shop description'140 ST @ 75 AVE
The latitude of Shop is  49.139685
The longitude of Shop is  -122.834392
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6067
Shop code is'56009
Shope Name is'SB 148 ST FS 94 AVE
Shop description'148 ST @ 94 AVE
The latitude of Shop is  49.173155
The longitude of Shop is  -122.812362
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6069
Shop code is'56011
Shope Name is'SB 148 ST FS 90 AVE
Shop description'148 ST @ 90 AVE
The latitude of Shop is  49.166192
The longitude of Shop is  -122.812466
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5745
Shop code is'55690
Shope Name is'NB 140 ST FS 72 AVE
Shop description'140 ST @ 72 AVE
The latitude of Shop is  49.134466
The longitude of Shop is  -122.834352
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6065
Shop code is'56007
Shope Name is'SB 148 ST FS 98 AVE
Shop description'148 ST @ 98 AVE
The latitude of Shop is  49.180174
The longitude of Shop is  -122.812250
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is11699
Shop code is'61628
Shope Name is'NB 140 ST FS 100 AVE
Shop description'140 ST @ 100 AVE
The latitude of Shop is  49.184659
The longitude of Shop is  -122.834043
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is9041
Shop code is'58334
Shope Name is'SB 144 ST NS 78A AVE
Shop description'144 ST @ 78A AVE
The latitude of Shop is  49.145604
The longitude of Shop is  -122.823533
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5763
Shop code is'55708
Shope Name is'NB 140 ST FS GREEN TIMBERS WAY
Shop description'140 ST @ GREEN TIMBERS WAY
The latitude of Shop is  49.181387
The longitude of Shop is  -122.834191
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5751
Shop code is'55696
Shope Name is'NB 140 ST FS BEAR CREEK DR
Shop description'140 ST @ BEAR CREEK DR
The latitude of Shop is  49.151302
The longitude of Shop is  -122.834444
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6232
Shop code is'56172
Shope Name is'SB 144 ST FS 18 AVE
Shop description'144 ST @ 18 AVE
The latitude of Shop is  49.034410
The longitude of Shop is  -122.823413
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6070
Shop code is'56012
Shope Name is'SB 144 ST FS 80 AVE
Shop description'144 ST @ 80 AVE
The latitude of Shop is  49.147982
The longitude of Shop is  -122.823547
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is8357
Shop code is'58573
Shope Name is'SB 144 ST AT 6200 BLOCK
Shop description'144 ST @ 6200 BLOCK
The latitude of Shop is  49.115415
The longitude of Shop is  -122.823430
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5941
Shop code is'55885
Shope Name is'NB 144 ST FS 77A AVE
Shop description'144 ST @ 77A AVE
The latitude of Shop is  49.143562
The longitude of Shop is  -122.823331
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5777
Shop code is'55722
Shope Name is'SB 140 ST FS 96 AVE
Shop description'140 ST @ 96 AVE
The latitude of Shop is  49.176562
The longitude of Shop is  -122.834680
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5759
Shop code is'55704
Shope Name is'NB 140 ST FS 93A AVE
Shop description'140 ST @ 93A AVE
The latitude of Shop is  49.172817
The longitude of Shop is  -122.834397
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5782
Shop code is'55727
Shope Name is'SB 140 ST FS 86A AVE
Shop description'140 ST @ 86A AVE
The latitude of Shop is  49.160191
The longitude of Shop is  -122.834781
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5757
Shop code is'55702
Shope Name is'NB 140 ST FS 90 AVE
Shop description'140 ST @ 90 AVE
The latitude of Shop is  49.166800
The longitude of Shop is  -122.834481
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6076
Shop code is'56018
Shope Name is'NB 144 ST FS 70A AVE
Shop description'144 ST @ 70A AVE
The latitude of Shop is  49.131222
The longitude of Shop is  -122.823209
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5929
Shop code is'55873
Shope Name is'SB 144 ST FS 84 AVE
Shop description'144 ST @ 84 AVE
The latitude of Shop is  49.155035
The longitude of Shop is  -122.823500
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5783
Shop code is'55728
Shope Name is'SB 140 ST FS 85 AVE
Shop description'140 ST @ 85 AVE
The latitude of Shop is  49.158306
The longitude of Shop is  -122.834769
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6235
Shop code is'56175
Shope Name is'NB 144 ST FS 19A AVE
Shop description'144 ST @ 19A AVE
The latitude of Shop is  49.037533
The longitude of Shop is  -122.823222
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5951
Shop code is'55895
Shope Name is'NB 148 ST FS 84 AVE
Shop description'148 ST @ 84 AVE
The latitude of Shop is  49.155988
The longitude of Shop is  -122.812341
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5779
Shop code is'55724
Shope Name is'SB 140 ST FS 92 AVE
Shop description'140 ST @ 92 AVE
The latitude of Shop is  49.169800
The longitude of Shop is  -122.834759
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5762
Shop code is'55707
Shope Name is'NB 140 ST FS FRASER HWY
Shop description'140 ST @ FRASER HWY
The latitude of Shop is  49.179230
The longitude of Shop is  -122.834084
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6004
Shop code is'55948
Shope Name is'NB 148 ST FS 88 AVE
Shop description'148 ST @ 88 AVE
The latitude of Shop is  49.163443
The longitude of Shop is  -122.812279
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6227
Shop code is'56167
Shope Name is'SB 148 ST NS 26 AVE
Shop description'148 ST @ 26 AVE
The latitude of Shop is  49.050289
The longitude of Shop is  -122.812442
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is6351
Shop code is'56291
Shope Name is'SB 148 ST FS 20 AVE
Shop description'148 ST @ 20 AVE
The latitude of Shop is  49.037945
The longitude of Shop is  -122.812359
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5934
Shop code is'55878
Shope Name is'SB 144 ST AT 7300 BLOCK
Shop description'144 ST @ 7300 BLOCK
The latitude of Shop is  49.136147
The longitude of Shop is  -122.823482
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------, ------------------------------------
Shop Id is5791
Shop code is'55736
Shope Name is'SB 140 ST FS 74 AVE
Shop description'140 ST @ 74 AVE
The latitude of Shop is  49.136912
The longitude of Shop is  -122.834608
The zone of shop isZN 99
The url of shop isnull
The location type is 0
Parent(String) location is 'null

------------------------------------]

 */
public class test {
    public static void main(String[] args) throws FileNotFoundException {
        /*
    This is the string from input
    WB HASTINGS ST FS HOLDOM AVE-
    But for user seaching,
    we need to type
    HAST
    HASTIN
    HASTINGS ST FS HOLDOM AVE- WB
     */
        String inputString = "14";
        Function2 myuserInterce = new Function2(inputString);
        // printing this arraylist
        ArrayList<String>fullInformaition = myuserInterce.getFullInformation();
        System.out.println("The matching information is "+fullInformaition.size());
        System.out.println(fullInformaition);

    }


}
