package org.usfirst.frc.team6035.robot.auto;


public class LeftToRightSwitch extends AutoDirection {

  private double[] leftMotorSpeeds = {
    0.000000, 1.957206, 3.048819, 3.666310, 4.015547, 4.213016, 4.324586, 4.387566, 4.423010, 4.442916, 4.453976, 4.460126, 4.463369, 4.464983, 4.465511, 4.465424, 4.464791, 4.463892, 4.462619, 4.461326, 4.459771, 4.458487, 4.456812, 4.454988, 4.452396, 4.449368, 4.445274, 4.440762, 4.435090, 4.429550, 4.423071, 4.417783, 4.410950, 4.403545, 4.393025, 4.380754, 4.364149, 4.345884, 4.322934, 4.300638, 4.274657, 4.253817, 4.226945, 4.198064, 4.156859, 4.108986, 4.044149, 3.973521, 3.885374, 3.802346, 3.707967, 3.640282, 3.554725, 3.468834, 3.343849, 3.204597, 3.016897, 2.830328, 2.612420, 2.463399, 2.341276, 2.407902, 2.507468, 2.686878, 2.842369, 3.007523, 3.127485, 3.237502, 3.308854, 3.383111, 3.440245, 3.530010, 3.609919, 3.698358, 3.769453, 3.836033, 3.885072, 3.927752, 3.957499, 3.985508, 4.007384, 4.035276, 4.059968, 4.086097, 4.108328, 4.129573, 4.147571, 4.164249, 4.179047, 4.192923, 4.206320, 4.219238, 4.233305, 4.248264, 4.266333, 4.286216, 4.310871, 4.336905, 4.368282, 4.397717, 4.431295, 4.456838, 4.490115, 4.525336, 4.576709, 4.635736, 4.716306, 4.802009, 4.908594, 5.004350, 5.111787, 5.180368, 5.269416, 5.355600, 5.486675, 5.629985, 5.824944, 6.012415, 6.230084, 6.373572, 6.494791, 6.447261, 6.384306, 6.266552, 6.178950, 6.091185, 6.043099, 6.005598, 5.998782, 5.991002, 5.996028, 5.976864, 5.962372, 5.938954, 5.924506, 5.910091, 5.905554, 5.903002, 5.908319, 5.912535, 5.920367, 5.920560, 5.923181, 5.923657, 5.929354, 5.936238, 5.949823, 5.964628, 5.985829, 6.004396, 6.027126, 6.040261, 6.060771, 6.082195, 6.119376, 6.163529, 6.229095, 6.299968, 6.393132, 6.477762, 6.579069, 6.646812, 6.746120, 6.852864, 7.025329, 7.228119, 7.517635, 7.824759, 8.212036, 8.544074, 8.909334, 9.096253, 9.342500, 9.549836, 9.891842, 10.239081, 10.719387, 11.147931, 11.653792, 12.015418, 12.403659, 12.598982, 12.851702, 13.090117, 13.382032, 13.676345, 13.995441, 14.310466, 14.635400, 14.947637, 15.254328, 15.525858, 15.771445, 15.981576, 16.165553, 16.322358, 16.460477, 16.581108, 16.690609, 16.788457, 16.877843, 16.954376, 17.020300, 17.074273, 17.118846, 17.154034, 17.182157, 17.203207, 17.218988, 17.228644, 17.233577, 17.231745, 17.225402, 17.213156, 17.196267, 17.172644, 17.142910, 17.103926, 17.056545, 16.996464, 16.926392, 16.841213, 16.748888, 16.644733, 16.532243, 16.402741, 16.257591, 16.083987, 15.885486, 15.645164, 15.376125, 15.058461, 14.731467, 14.381372, 14.034099, 13.664925, 13.299203, 12.899754, 12.510778, 12.062336, 11.633636, 11.040460, 10.505212, 9.904598, 9.425490, 8.949598, 8.632583, 8.346231, 8.214417, 8.044411, 7.935608, 7.572379, 7.211108, 6.722429, 6.309776, 5.888529, 5.578381, 5.298554, 5.113721, 4.932870, 4.799394, 4.606908, 4.441904, 4.263157, 4.123550, 3.994695, 3.903665, 3.826118, 3.776300, 3.729624, 3.696206, 3.648650, 3.608491, 3.564880, 3.531421, 3.500343, 3.479169, 3.460559, 3.449219, 3.436599, 3.427202, 3.410300, 3.396608, 3.381303, 3.372361, 3.364571, 3.364317, 3.363816, 3.369943, 3.369346, 3.372499, 3.358049, 3.354696, 3.352736, 3.378165, 3.417468, 3.497170, 3.589144, 3.723779, 3.830180, 3.943349, 3.899075, 3.831981, 3.666260, 3.521365, 3.344690, 3.222289, 3.099901, 3.034290, 2.950138, 2.889544, 2.743387, 2.605227, 2.431609, 2.288833, 2.146937, 2.044013, 1.952029, 1.892313, 1.833345, 1.790257, 1.725226, 1.669726, 1.608828, 1.562987, 1.521443, 1.495736, 1.475527, 1.467977, 1.460867, 1.460669, 1.451981, 1.449699, 1.447314, 1.456113, 1.469610, 1.496727, 1.527859, 1.571808, 1.612170, 1.660812, 1.692632, 1.737698, 1.784120, 1.857382, 1.941015, 2.058171, 2.178957, 2.328398, 2.452301, 2.586565, 2.650468, 2.737137, 2.809150, 2.934713, 3.062190, 3.242739, 3.392706, 3.561493, 3.624026, 3.654283, 3.505055, 3.355619, 3.169897, 3.030465, 2.905070, 2.826665, 2.765638, 2.737065, 2.711796, 2.700373, 2.671497, 2.648586, 2.620273, 2.600341, 2.581486, 2.570759, 2.562231, 2.559670, 2.557142, 2.557180, 2.553027, 2.549744, 2.544781, 2.541335, 2.537804, 2.535922, 2.534373, 2.534109, 2.533770, 2.533984, 2.533162, 2.532508, 2.531417, 2.530662, 2.529863, 2.529446, 2.529095, 2.529046, 2.528970, 2.529018, 2.528804, 2.528610, 2.528278, 2.527973, 2.527562, 2.527079, 2.526325, 2.525134, 2.523041, 2.519393, 2.512887, 2.501440, 2.481221, 2.445559, 2.382572, 2.271309, 2.074694, 1.727218, 1.113069, 0.000000
  };

  private double[] rightMotorSpeeds = {
    0.000000, 1.957469, 3.049363, 3.667157, 4.016750, 4.214610, 4.326659, 4.390142, 4.426189, 4.446659, 4.458366, 4.465006, 4.468905, 4.471222, 4.472795, 4.473923, 4.474973, 4.475896, 4.476937, 4.477803, 4.478787, 4.479367, 4.480247, 4.481165, 4.482740, 4.484583, 4.487304, 4.490175, 4.493922, 4.497172, 4.501026, 4.503295, 4.506826, 4.510540, 4.516960, 4.524502, 4.535650, 4.547443, 4.562836, 4.576204, 4.592021, 4.601273, 4.615616, 4.630677, 4.656752, 4.687462, 4.732856, 4.780871, 4.843229, 4.896586, 4.958293, 4.990180, 5.039014, 5.086836, 5.173114, 5.271938, 5.418024, 5.561161, 5.735700, 5.842192, 5.926521, 5.828376, 5.707088, 5.514896, 5.354287, 5.189811, 5.074591, 4.972338, 4.910788, 4.848084, 4.803567, 4.727290, 4.660551, 4.584742, 4.525108, 4.468962, 4.429188, 4.394933, 4.372816, 4.351958, 4.336718, 4.315103, 4.296043, 4.274991, 4.257202, 4.239927, 4.225471, 4.212089, 4.200401, 4.189601, 4.179245, 4.169419, 4.158387, 4.146494, 4.131529, 4.114952, 4.093886, 4.071939, 4.045232, 4.021280, 3.993989, 3.975733, 3.950544, 3.924537, 3.883664, 3.837102, 3.771422, 3.704066, 3.619840, 3.551716, 3.477308, 3.448277, 3.404174, 3.370051, 3.298863, 3.226927, 3.117026, 3.033512, 2.940274, 2.946200, 2.994651, 3.230506, 3.480912, 3.780941, 4.035219, 4.275688, 4.460096, 4.622313, 4.742742, 4.857580, 4.952211, 5.065594, 5.163912, 5.261713, 5.339453, 5.408174, 5.458363, 5.500206, 5.528564, 5.554155, 5.572440, 5.595487, 5.612308, 5.627820, 5.634352, 5.636351, 5.628354, 5.616160, 5.594760, 5.573336, 5.545345, 5.524572, 5.494418, 5.461069, 5.409640, 5.348267, 5.262372, 5.167313, 5.046405, 4.930087, 4.794623, 4.690709, 4.556236, 4.415862, 4.213454, 3.985620, 3.679777, 3.369483, 3.000250, 2.717100, 2.443416, 2.402669, 2.365367, 2.444219, 2.477641, 2.622750, 2.773297, 3.154434, 3.651427, 4.516784, 5.533004, 6.895518, 8.180589, 9.420616, 10.463647, 11.376833, 12.122774, 12.770971, 13.314418, 13.812659, 14.254107, 14.684698, 15.060189, 15.398713, 15.680397, 15.922888, 16.121089, 16.291264, 16.432928, 16.559758, 16.669885, 16.773896, 16.862577, 16.940369, 17.002779, 17.053849, 17.092130, 17.121234, 17.140726, 17.153755, 17.159761, 17.161554, 17.156880, 17.146353, 17.127870, 17.101214, 17.064386, 17.016898, 16.957011, 16.884941, 16.799895, 16.703852, 16.595795, 16.474142, 16.333998, 16.170718, 15.976885, 15.747521, 15.475354, 15.160123, 14.798853, 14.402031, 13.965012, 13.483859, 12.935631, 12.305005, 11.556187, 10.679629, 9.640165, 8.482103, 7.205415, 6.025964, 4.910220, 4.009031, 3.205338, 2.590184, 2.014043, 1.568848, 1.133765, 0.890673, 0.787408, 0.647773, 0.647838, 0.701237, 0.826658, 1.056024, 1.240138, 1.436497, 1.566963, 1.712655, 1.824643, 2.005116, 2.164852, 2.342745, 2.483981, 2.615720, 2.709879, 2.790323, 2.842402, 2.890561, 2.924532, 2.971611, 3.010107, 3.050631, 3.079349, 3.103639, 3.115729, 3.122425, 3.118880, 3.113067, 3.100751, 3.092218, 3.077726, 3.061205, 3.034474, 3.000860, 2.953128, 2.896557, 2.823774, 2.745736, 2.653461, 2.567042, 2.462787, 2.348040, 2.197458, 2.019288, 1.786177, 1.520770, 1.195779, 0.881595, 0.559548, 0.397332, 0.307949, 0.226477, 0.195473, 0.170989, 0.148795, 0.156386, 0.151595, 0.160206, 0.197788, 0.192184, 0.224612, 0.316667, 0.399603, 0.495925, 0.563759, 0.627547, 0.664228, 0.703483, 0.729626, 0.779690, 0.822563, 0.872776, 0.909909, 0.944310, 0.964307, 0.979894, 0.983774, 0.987945, 0.985882, 0.992894, 0.994143, 0.996132, 0.987617, 0.975133, 0.949809, 0.921369, 0.881074, 0.845511, 0.802828, 0.778373, 0.742023, 0.706241, 0.646155, 0.579721, 0.485657, 0.397401, 0.294902, 0.241284, 0.214625, 0.178732, 0.177216, 0.187039, 0.226764, 0.277224, 0.383957, 0.460799, 0.562816, 0.575412, 0.602879, 0.545443, 0.638737, 0.849747, 1.050387, 1.252989, 1.411082, 1.551247, 1.655186, 1.753331, 1.833470, 1.927735, 2.008978, 2.089151, 2.153330, 2.210328, 2.253377, 2.290056, 2.317143, 2.341840, 2.361723, 2.384153, 2.403364, 2.422240, 2.437406, 2.450934, 2.461212, 2.470015, 2.476551, 2.482519, 2.487331, 2.492741, 2.497378, 2.501937, 2.505606, 2.508885, 2.511380, 2.513519, 2.515107, 2.516555, 2.517717, 2.519014, 2.520106, 2.521150, 2.521927, 2.522518, 2.522757, 2.522623, 2.521850, 2.520145, 2.516790, 2.510668, 2.499555, 2.479694, 2.444331, 2.381627, 2.270597, 2.074193, 1.726896, 1.112914, 0.000000
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
