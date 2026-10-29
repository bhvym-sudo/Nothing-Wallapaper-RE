.class public final synthetic Ll7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/d;->q:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Ll7/d;->q:Landroid/widget/TextView;

    invoke-static {p0}, Ll7/k;->m0(Landroid/widget/TextView;)V

    return-void
.end method
