.class public final Lx6/k$e;
.super Landroid/util/LruCache;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx6/k;-><init>(Lx6/q;Landroid/content/Context;Lcom/android/wallpaper/asset/a;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx6/k;


# direct methods
.method constructor <init>(Lx6/k;)V
    .registers 2

    iput-object p1, p0, Lx6/k$e;->a:Lx6/k;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected a(ZLjava/lang/String;Lx6/k$b;Lx6/k$b;)V
    .registers 5

    const-string p4, "key"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1c

    iget-object p1, p0, Lx6/k$e;->a:Lx6/k;

    invoke-static {p1}, Lx6/k;->f(Lx6/k;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1c

    iget-object p1, p0, Lx6/k$e;->a:Lx6/k;

    invoke-static {p1}, Lx6/k;->f(Lx6/k;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    return-void
.end method

.method public bridge synthetic entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 5

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lx6/k$b;

    check-cast p4, Lx6/k$b;

    invoke-virtual {p0, p1, p2, p3, p4}, Lx6/k$e;->a(ZLjava/lang/String;Lx6/k$b;Lx6/k$b;)V

    return-void
.end method
