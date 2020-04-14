import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lab4_tabs.ftcFragment;
import com.example.lab4_tabs.mtkFragment;
import com.example.lab4_tabs.tipcFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new ftcFragment();
            case 1: return new mtkFragment();
            case 2: return new tipcFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() { return tabCount; }

}
