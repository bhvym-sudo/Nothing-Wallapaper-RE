.class public final LA6/c$b;
.super Landroid/util/LruCache;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/c;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA6/c;


# direct methods
.method constructor <init>(LA6/c;I)V
    .registers 3

    iput-object p1, p0, LA6/c$b;->a:LA6/c;

    invoke-direct {p0, p2}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected a(ZLl6/a;Ljava/io/File;Ljava/io/File;)V
    .registers 5

    const/4 p4, 0x0

    if-eqz p1, :cond_2e

    if-eqz p3, :cond_2e

    iget-object p0, p0, LA6/c$b;->a:LA6/c;

    invoke-static {p0}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p0

    if-eqz p2, :cond_11

    invoke-virtual {p2}, Ll6/a;->b()Ljava/lang/String;

    move-result-object p4

    :cond_11
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "entryRemoved: delete file="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    return-void

    :cond_2e
    iget-object p0, p0, LA6/c$b;->a:LA6/c;

    invoke-static {p0}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p0

    if-eqz p2, :cond_3a

    invoke-virtual {p2}, Ll6/a;->b()Ljava/lang/String;

    move-result-object p4

    :cond_3a
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "entryRemoved: file="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", evicted="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 5

    check-cast p2, Ll6/a;

    check-cast p3, Ljava/io/File;

    check-cast p4, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, LA6/c$b;->a(ZLl6/a;Ljava/io/File;Ljava/io/File;)V

    return-void
.end method
