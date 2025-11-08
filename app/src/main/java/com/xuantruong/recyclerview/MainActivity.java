package com.xuantruong.recyclerview;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Tạo dữ liệu mẫu
        userList = createUserList();

        // Khởi tạo adapter
        adapter = new UserAdapter(userList);
        recyclerView.setAdapter(adapter);

        // Xử lý onClick
        adapter.setOnItemClickListener(new UserAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(User user, int position) {
                String message = "Clicked: " + user.getName() + "\nPosition: " + position;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<User> createUserList() {
        List<User> users = new ArrayList<>();

        users.add(new User("Nguyễn Văn A", "nguyenvana@email.com", R.drawable.ic_launcher_foreground));
        users.add(new User("Trần Thị B", "tranthib@email.com", R.drawable.ic_launcher_foreground));
        users.add(new User("Lê Văn C", "levanc@email.com", R.drawable.ic_launcher_foreground));
        users.add(new User("Phạm Thị D", "phamthid@email.com", R.drawable.ic_launcher_foreground));
        users.add(new User("Hoàng Văn E", "hoangvane@email.com", R.drawable.ic_launcher_foreground));
        users.add(new User("Vũ Thị F", "vuthif@email.com", R.drawable.ic_launcher_foreground));

        return users;
    }
}