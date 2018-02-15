package org.usfirst.frc.team6035.robot.auto;

public class MiddleToLeftSwitch extends AutoDirection {

  private double[] leftMotorSpeeds = {
    0.000000, 0.535893, 0.834277, 1.002984, 1.098289, 1.152051, 1.182245, 1.199084, 1.208261, 1.213090, 1.215306, 1.216073, 1.215831, 1.215188, 1.214141, 1.213363, 1.212619, 1.212853, 1.213105, 1.213653, 1.213817, 1.213808, 1.213155, 1.212090, 1.210174, 1.207735, 1.204245, 1.200301, 1.195228, 1.190261, 1.184565, 1.180616, 1.177143, 1.178096, 1.179250, 1.181766, 1.182706, 1.182967, 1.180546, 1.176432, 1.168806, 1.159034, 1.144957, 1.129037, 1.108529, 1.088497, 1.065542, 1.049765, 1.035983, 1.040237, 1.045329, 1.055956, 1.060227, 1.061794, 1.052618, 1.036758, 1.006976, 0.968904, 0.914044, 0.852496, 0.773558, 0.697722, 0.611764, 0.555709, 0.509008, 0.533544, 0.562070, 0.612607, 0.640519, 0.661162, 0.647039, 0.617615, 0.553268, 0.486210, 0.404897, 0.377206, 0.418867, 0.504074, 0.642971, 0.693749, 0.725313, 0.582579, 0.488728, 0.441354, 0.457732, 0.522473, 0.549742, 0.569430, 0.536673, 0.506501, 0.443993, 0.431273, 0.428390, 0.540700, 0.708244, 1.049655, 1.452664, 2.019461, 2.544230, 3.047503, 3.458497, 3.808665, 4.080714, 4.302509, 4.471882, 4.609285, 4.715477, 4.805597, 4.879851, 4.951340, 5.018258, 5.094289, 5.172699, 5.267405, 5.356907, 5.444426, 5.519065, 5.584866, 5.638008, 5.682649, 5.717895, 5.747218, 5.770600, 5.790838, 5.807966, 5.824492, 5.840097, 5.857430, 5.875180, 5.896107, 5.915857, 5.935086, 5.951504, 5.965935, 5.977554, 5.987202, 5.994689, 6.000688, 6.005215, 6.008738, 6.011316, 6.013260, 6.014617, 6.015603, 6.016241, 6.016695, 6.016910, 6.016908, 6.016663, 6.016106, 6.015245, 6.013899, 6.012112, 6.009534, 6.006261, 6.001671, 5.995981, 5.988140, 5.978668, 5.965928, 5.951297, 5.932709, 5.914246, 5.895313, 5.878146, 5.861622, 5.846698, 5.831760, 5.817316, 5.801193, 5.783998, 5.762559, 5.738066, 5.705488, 5.667414, 5.615713, 5.556714, 5.478988, 5.402182, 5.322857, 5.252970, 5.187586, 5.133325, 5.083852, 5.044895, 5.008847, 4.984566, 4.961602, 4.956181, 4.948672, 4.966174, 4.956375, 4.956717, 4.819419, 4.670147, 4.420279, 4.185326, 3.901206, 3.662532, 3.422198, 3.250437, 3.108397, 3.047458, 3.028475, 3.093989, 3.188471, 3.351151, 3.472851, 3.594429, 3.507383, 3.379133, 3.131215, 2.897731, 2.632872, 2.418037, 2.216992, 2.074256, 1.959262, 1.897843, 1.861947, 1.870112, 1.889051, 1.935189, 1.956757, 1.974366, 1.910256, 1.836560, 1.729330, 1.635412, 1.539172, 1.464744, 1.399312, 1.354990, 1.321387, 1.305595, 1.298356, 1.305169, 1.315045, 1.333272, 1.342830, 1.350844, 1.332288, 1.311333, 1.280481, 1.255279, 1.230612, 1.214941, 1.203788, 1.202355, 1.206369, 1.220201, 1.238571, 1.266161, 1.294148, 1.327924, 1.351153, 1.371778, 1.364466, 1.355567, 1.337662, 1.328603, 1.322848, 1.331935, 1.350038, 1.386911, 1.434940, 1.505044, 1.584153, 1.685648, 1.783726, 1.894704, 1.969459, 2.033277, 2.012331, 1.987094, 1.936912, 1.913745, 1.900871, 1.930521, 1.983887, 2.087104, 2.214395, 2.393308, 2.580705, 2.808623, 3.001353, 3.199632, 3.284321, 3.325056, 3.178180, 3.021368, 2.822070, 2.661767, 2.512427, 2.405084, 2.317244, 2.261717, 2.222594, 2.206971, 2.202822, 2.215709, 2.233335, 2.260924, 2.281152, 2.300656, 2.295425, 2.287057, 2.268520, 2.252784, 2.235422, 2.222829, 2.211637, 2.205038, 2.200509, 2.199926, 2.201190, 2.205706, 2.211075, 2.218524, 2.224343, 2.229958, 2.229868, 2.228873, 2.225302, 2.222229, 2.218630, 2.216125, 2.213913, 2.212877, 2.212357, 2.212945, 2.213984, 2.215990, 2.218047, 2.220681, 2.222321, 2.223690, 2.222394, 2.220834, 2.218290, 2.216342, 2.214465, 2.213593, 2.213203, 2.213983, 2.215321, 2.217924, 2.220858, 2.224987, 2.228577, 2.232733, 2.234143, 2.234604, 2.228932, 2.223037, 2.215382, 2.209964, 2.205468, 2.204491, 2.205531, 2.210871, 2.218497, 2.231152, 2.245395, 2.264872, 2.282675, 2.303572, 2.313572, 2.320228, 2.300328, 2.279608, 2.250959, 2.232884, 2.219795, 2.224767, 2.241831, 2.283690, 2.342680, 2.435473, 2.548236, 2.704377, 2.870830, 3.076708, 3.236749, 3.385267, 3.339289, 3.248375, 3.041734, 2.841728, 2.606735, 2.413761, 2.229983, 2.098992, 1.992661, 1.936899, 1.905195, 1.916366, 1.937971, 1.986697, 2.010566, 2.030187, 1.965352, 1.889621, 1.777819, 1.678718, 1.576083, 1.495346, 1.423259, 1.372455, 1.332288, 1.309791, 1.295812, 1.295418, 1.298410, 1.309387, 1.313268, 1.316058, 1.295898, 1.273373, 1.241872, 1.214381, 1.186517, 1.164786, 1.145616, 1.132154, 1.121575, 1.115615, 1.111889, 1.111651, 1.112286, 1.114944, 1.115811, 1.116404, 1.111259, 1.105548, 1.097629, 1.090737, 1.083778, 1.078359, 1.073588, 1.070239, 1.067610, 1.066125, 1.065193, 1.065123, 1.065269, 1.065913, 1.066116, 1.066254, 1.064985, 1.063578, 1.061632, 1.059938, 1.058228, 1.056894, 1.055718, 1.054887, 1.054230, 1.053849, 1.053601, 1.053556, 1.053561, 1.053678, 1.053683, 1.053651, 1.053257, 1.052762, 1.052022, 1.051126, 1.049849, 1.047993, 1.045002, 1.040018, 1.031423, 1.016436, 0.990087, 0.943644, 0.861641, 0.716776, 0.460772, 0.000000
  };

  private double[] rightMotorSpeeds = {
    0.000000, 0.536242, 0.835003, 1.004129, 1.099952, 1.154323, 1.185309, 1.203090, 1.213506, 1.219773, 1.223849, 1.226658, 1.228945, 1.230772, 1.232519, 1.233729, 1.234755, 1.234719, 1.234615, 1.234185, 1.234119, 1.234216, 1.234953, 1.236105, 1.238113, 1.240660, 1.244275, 1.248373, 1.253630, 1.258821, 1.264782, 1.269041, 1.272859, 1.272280, 1.271497, 1.269346, 1.268754, 1.268839, 1.271606, 1.276090, 1.284125, 1.294374, 1.309017, 1.325630, 1.346978, 1.368042, 1.392224, 1.409458, 1.424873, 1.422417, 1.419128, 1.410299, 1.407770, 1.407949, 1.418906, 1.436700, 1.468652, 1.509303, 1.567276, 1.632714, 1.716475, 1.798376, 1.891747, 1.956858, 2.014062, 2.001521, 1.985675, 1.948732, 1.935454, 1.931793, 1.967034, 2.025347, 2.131930, 2.264590, 2.451282, 2.653129, 2.903558, 3.129519, 3.372689, 3.508261, 3.606556, 3.505892, 3.401942, 3.254697, 3.170679, 3.112457, 3.135620, 3.198811, 3.341316, 3.511870, 3.748863, 3.980746, 4.253469, 4.470432, 4.695413, 4.815138, 4.921279, 4.900752, 4.897493, 4.878753, 4.888666, 4.901766, 4.931838, 4.964087, 5.005677, 5.049227, 5.100466, 5.155206, 5.218487, 5.285677, 5.360627, 5.434621, 5.509824, 5.571553, 5.626756, 5.670634, 5.708376, 5.738359, 5.764091, 5.785152, 5.803964, 5.820526, 5.836594, 5.852176, 5.868590, 5.885442, 5.903598, 5.921642, 5.939857, 5.955343, 5.969096, 5.980099, 5.989315, 5.996454, 6.002242, 6.006636, 6.010126, 6.012733, 6.014767, 6.016245, 6.017355, 6.018086, 6.018541, 6.018665, 6.018505, 6.017951, 6.017065, 6.015778, 6.014047, 6.011778, 6.008811, 6.005016, 6.000103, 5.993925, 5.986051, 5.976402, 5.964455, 5.950450, 5.933968, 5.916103, 5.896820, 5.878552, 5.860612, 5.843741, 5.826741, 5.809490, 5.790477, 5.769177, 5.743713, 5.713422, 5.675937, 5.630916, 5.575620, 5.511297, 5.435667, 5.354406, 5.266956, 5.186336, 5.107622, 5.035026, 4.961219, 4.886103, 4.800976, 4.703585, 4.582864, 4.435286, 4.245360, 4.010196, 3.708374, 3.346073, 2.899511, 2.414568, 1.880551, 1.457131, 1.082065, 0.854393, 0.683093, 0.624109, 0.584961, 0.599780, 0.594386, 0.598583, 0.561301, 0.523944, 0.460914, 0.458845, 0.544477, 0.674020, 0.849746, 0.843318, 0.803080, 0.647505, 0.511296, 0.360933, 0.298193, 0.324660, 0.360825, 0.408690, 0.426358, 0.431978, 0.401613, 0.365076, 0.304566, 0.271153, 0.245392, 0.289343, 0.347372, 0.442144, 0.526401, 0.615050, 0.683626, 0.744467, 0.785216, 0.815955, 0.829431, 0.834707, 0.826190, 0.814746, 0.795056, 0.784081, 0.774734, 0.792044, 0.811952, 0.841958, 0.866552, 0.890833, 0.906344, 0.917560, 0.919287, 0.915822, 0.902816, 0.885600, 0.859521, 0.833477, 0.802076, 0.781714, 0.764338, 0.775255, 0.787790, 0.809347, 0.821966, 0.831320, 0.825935, 0.811888, 0.779609, 0.737091, 0.673721, 0.603152, 0.512480, 0.428439, 0.335479, 0.284312, 0.251141, 0.283750, 0.325888, 0.396324, 0.441750, 0.479819, 0.479771, 0.464291, 0.412847, 0.361550, 0.299023, 0.297010, 0.370694, 0.449332, 0.559472, 0.579387, 0.596467, 0.499982, 0.540008, 0.718680, 0.903217, 1.097099, 1.253592, 1.389936, 1.489710, 1.569306, 1.621666, 1.660654, 1.681512, 1.698376, 1.706378, 1.724011, 1.743430, 1.788421, 1.833656, 1.885739, 1.930215, 1.972109, 2.004927, 2.032986, 2.053474, 2.069804, 2.080540, 2.088501, 2.092631, 2.095869, 2.097131, 2.100445, 2.104121, 2.113622, 2.123280, 2.134672, 2.144379, 2.153564, 2.160578, 2.166431, 2.170314, 2.173069, 2.174188, 2.174454, 2.173414, 2.172065, 2.169919, 2.168587, 2.167366, 2.168663, 2.170077, 2.172315, 2.173778, 2.174950, 2.174856, 2.173943, 2.171457, 2.167886, 2.162437, 2.155866, 2.147229, 2.138057, 2.127270, 2.118043, 2.108924, 2.105190, 2.101800, 2.100326, 2.097037, 2.092930, 2.085267, 2.075006, 2.059518, 2.040097, 2.013559, 1.982458, 1.942766, 1.900445, 1.850825, 1.807301, 1.763806, 1.743986, 1.725841, 1.716719, 1.699345, 1.678186, 1.639884, 1.588705, 1.511379, 1.414151, 1.281052, 1.126738, 0.933722, 0.744400, 0.552572, 0.480350, 0.556107, 0.534589, 0.516988, 0.416098, 0.350163, 0.295464, 0.307008, 0.373516, 0.426756, 0.478911, 0.495186, 0.495842, 0.458752, 0.413699, 0.343125, 0.298185, 0.259416, 0.298527, 0.352347, 0.445437, 0.529255, 0.619350, 0.690066, 0.754016, 0.798261, 0.832957, 0.850811, 0.860620, 0.857143, 0.850327, 0.835507, 0.827629, 0.820806, 0.836913, 0.855734, 0.883909, 0.908582, 0.934065, 0.953848, 0.971405, 0.983544, 0.993003, 0.998000, 1.000851, 1.000267, 0.998811, 0.995321, 0.993581, 0.992099, 0.996345, 1.001227, 1.008396, 1.014648, 1.021064, 1.026036, 1.030435, 1.033477, 1.035846, 1.037107, 1.037833, 1.037710, 1.037371, 1.036531, 1.036121, 1.035773, 1.036828, 1.038038, 1.039805, 1.041346, 1.042926, 1.044153, 1.045239, 1.045996, 1.046588, 1.046913, 1.047107, 1.047096, 1.047028, 1.046834, 1.046725, 1.046609, 1.046778, 1.046916, 1.047065, 1.046954, 1.046483, 1.045276, 1.042877, 1.038351, 1.030151, 1.015463, 0.989367, 0.943117, 0.861279, 0.716547, 0.460663, 0.000000
  };

  public int nSteps() {
    return leftMotorSpeeds.length;
  }

  public double leftSpeed(int i) {
    return leftMotorSpeeds[i];
  }

  public double rightSpeed(int i) {
    return rightMotorSpeeds[i];
  }

}
