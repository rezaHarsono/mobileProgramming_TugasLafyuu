//package com.reza.mobileprogramming_tugasui.Screens
//
//import android.provider.ContactsContract.Data
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.MoreVert
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material.icons.filled.Star
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.reza.mobileprogramming_tugasui.Cards.CardFlashSale
//import com.reza.mobileprogramming_tugasui.Data.DataProduct
//import com.reza.mobileprogramming_tugasui.Data.DataProvider
//import com.reza.mobileprogramming_tugasui.R
//
//@Composable
//fun DetailProductScreen(navController: NavController,) {
//    val scrollState = rememberScrollState()
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(vertical = 8.dp, horizontal = 16.dp)
//                .verticalScroll(scrollState)
//        ) {
////        Header
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 16.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                IconButton(onClick = { navController.popBackStack() }) {
//                    Icon(Icons.Default.ArrowBack, contentDescription = null)
//                }
//                Text(
//                        text = "products.name",
//                        color = Color.Black.copy(),
//                        fontSize = 16.sp,
//                        fontWeight = FontWeight.Bold)
//                IconButton(onClick = { /*TODO*/ }) {
//                    Icon(Icons.Default.Search, contentDescription = null)
//                }
//                IconButton(onClick = { /*TODO*/ }) {
//                    Icon(Icons.Default.MoreVert, contentDescription = null)
//                }
//            }
//            Spacer(modifier = Modifier.height(32.dp))
////          ProductImage
//            Image(
//                    painter = painterResource(id = R.drawable.phantom),
//                    contentDescription = null,
//                    modifier = Modifier.align(Alignment.CenterHorizontally))
//            Spacer(modifier = Modifier.height(32.dp))
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                //ProductName
//                Text(
//                        text = "Product",
//                        color = Color.Black.copy(),
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold)
//                IconButton(onClick = { /*TODO*/ }) {
//                    Icon(Icons.Default.Favorite, contentDescription = null)
//                }
//            }
//            Spacer(modifier = Modifier.height(8.dp))
////        Rating
//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Icon(Icons.Default.Star, contentDescription = null)
//                Icon(Icons.Default.Star, contentDescription = null)
//                Icon(Icons.Default.Star, contentDescription = null)
//                Icon(Icons.Default.Star, contentDescription = null)
//                Icon(Icons.Default.Star, contentDescription = null)
//
//            }
//            Spacer(modifier = Modifier.height(32.dp))
////        Price
//            Text(text = "Rp 200.000", modifier = Modifier.align(Alignment.Start), fontSize = 24.sp)
//            Spacer(modifier = Modifier.height(32.dp))
////        Select Size
//            Text(text = "Select Size", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//            Spacer(modifier = Modifier.height(8.dp))
//            SelectSize()
//            Spacer(modifier = Modifier.height(16.dp))
////        Select Color
//            Text(text = "Select Color", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//            Spacer(modifier = Modifier.height(8.dp))
//            SelectColor()
//            Spacer(modifier = Modifier.height(16.dp))
////        Description
//            Text(text = "Specification", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//            Spacer(modifier = Modifier.height(16.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ){
//                Text(text = "Shown:")
//                Spacer(modifier = Modifier.width(120.dp))
//                Text(text =
//                "Laser\n" +
//                        "Blue/Anthracite/Watermelon/White",
//                    textAlign = TextAlign.End, color = Color.Gray)
//            }
//            Spacer(modifier = Modifier.height(32.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Text(text = "Style:")
//                Spacer(modifier = Modifier.width(120.dp))
//                Text(text = "CD0113-400", color = Color.Gray)
//            }
//            Spacer(modifier = Modifier.height(32.dp))
//            Text(text = "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
//                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
//                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
//                    "                    \"experience.\"")
//            Spacer(modifier = Modifier.height(32.dp))
////        Review
//            Review()
//            Spacer(modifier = Modifier.height(32.dp))
////        You Might Also Like
//            Text(text = "You Might Also Like", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//            Spacer(modifier = Modifier.height(16.dp))
//            AlsoLike()
//            Spacer(modifier = Modifier.height(32.dp))
//        }
//    }
//
//
//@Composable
//fun SelectSize() {
//    var size = listOf("6", "6.5", "7", "7.5", "8", "8.5")
//    LazyRow {
//        items(size) { size ->
//            Column(
//                modifier = Modifier
//                    .padding(8.dp)
//                    .size(50.dp)
//                    .border(2.dp, Color.Red, shape = RoundedCornerShape(100)),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = size, fontWeight = FontWeight.Bold)
//            }
//        }
//    }
//}
//
//@Composable
//fun SelectColor() {
//    var colors = listOf(Color.Red, Color.Blue, Color.Green, Color.LightGray, Color.Magenta)
//    LazyRow {
//        items(colors) { colors ->
//            Column(
//                modifier = Modifier
//                    .padding(8.dp)
//                    .size(50.dp)
//                    .background(colors, shape = RoundedCornerShape(100)),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ){
//            }
//        }
//    }
//}
//
//@Composable
//fun Review() {
//    Column() {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Text(text = "Review Product", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//            Text(text = "See More", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Red)
//        }
//        Spacer(modifier = Modifier.height(8.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Icon(Icons.Default.Star, contentDescription = null)
//            Icon(Icons.Default.Star, contentDescription = null)
//            Icon(Icons.Default.Star, contentDescription = null)
//            Icon(Icons.Default.Star, contentDescription = null)
//            Icon(Icons.Default.Star, contentDescription = null)
//            Spacer(modifier = Modifier.width(8.dp))
//            Text(text = "4.5 (5 Reviews)")
//        }
//        Spacer(modifier = Modifier.height(8.dp))
//        Row(modifier = Modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically) {
//            Image(
//                painter = painterResource(id = R.drawable.phantom),
//                contentDescription = null,
//                modifier = Modifier
//                    .size(70.dp)
//                    .border(2.dp, Color.Red, shape = RoundedCornerShape(100))
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Column(){
//                Text(text = "Reza", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//                Row(){
//                    Icon(Icons.Default.Star, contentDescription = null)
//                    Icon(Icons.Default.Star, contentDescription = null)
//                    Icon(Icons.Default.Star, contentDescription = null)
//                    Icon(Icons.Default.Star, contentDescription = null)
//                    Icon(Icons.Default.Star, contentDescription = null)
//                }
//            }
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//        Text(text = "air max are always very comfortable fit, clean and just perfect in every way. just the box was too small and scrunched the sneakers up a little bit, not sure if the box was always this small but the 90s are and will always be one of my favorites."
//        , textAlign = TextAlign.Justify,
//            color = Color.Gray
//        )
//    }
//}
//
//@Composable
//fun AlsoLike() {
//    val relatedProducts = listOf(
//        DataProduct(
//            1,
//            "Favorite Item1",
//            "Rp 200.000",
//            "Rp 400.000",
//            "50% off",
//            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
//                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
//                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
//                    "                    \"experience.\"",
//            R.drawable.phantom
//        ),
//        DataProduct(
//            1,
//            "Favorite Item1",
//            "Rp 200.000",
//            "Rp 400.000",
//            "50% off",
//            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
//                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
//                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
//                    "                    \"experience.\"",
//            R.drawable.phantom
//        ),
//        DataProduct(
//            1,
//            "Favorite Item1",
//            "Rp 200.000",
//            "Rp 400.000",
//            "50% off",
//            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
//                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
//                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
//                    "                    \"experience.\"",
//            R.drawable.phantom
//        ),
//        DataProduct(
//            1,
//            "Favorite Item1",
//            "Rp 200.000",
//            "Rp 400.000",
//            "50% off",
//            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
//                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
//                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
//                    "                    \"experience.\"",
//            R.drawable.phantom
//        ),
//        DataProduct(
//            1,
//            "Favorite Item1",
//            "Rp 200.000",
//            "Rp 400.000",
//            "50% off",
//            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
//                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
//                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
//                    "                    \"experience.\"",
//            R.drawable.phantom
//        ),
//        DataProduct(
//            1,
//            "Favorite Item1",
//            "Rp 200.000",
//            "Rp 400.000",
//            "50% off",
//            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
//                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
//                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
//                    "                    \"experience.\"",
//            R.drawable.phantom
//        )
//    )
//
//    LazyRow() {
//        items(relatedProducts) { relatedProduct ->
//            Column(
//                modifier = Modifier.padding(8.dp),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                CardFlashSale(navController = rememberNavController(), product = relatedProduct)
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DetailProductScreenPreview() {
//    val products = remember { DataProvider.productList }
//    DetailProductScreen(navController = rememberNavController())
//}