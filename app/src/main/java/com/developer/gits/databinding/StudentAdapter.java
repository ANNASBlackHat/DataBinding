package com.developer.gits.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Sasha Grey on 5/24/2016.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolderItem>{

    private List<Student> studentList;

    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public ViewHolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.list_item, parent, false);
        return new ViewHolderItem(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolderItem holder, int position) {
        holder.mViewDataBinding.setVariable(com.developer.gits.databinding.BR.mhs,studentList.get(position) );
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class ViewHolderItem extends RecyclerView.ViewHolder{

        ViewDataBinding mViewDataBinding;

        public ViewHolderItem(ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());

            mViewDataBinding = viewDataBinding;
            mViewDataBinding.executePendingBindings();
        }

        public ViewDataBinding getViewDataBinding() {
            return mViewDataBinding;
        }
    }
}
