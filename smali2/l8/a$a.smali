.class public final Ll8/a$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll8/a;->a(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILv8/a;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lv8/a;


# direct methods
.method constructor <init>(Lv8/a;)V
    .registers 2

    iput-object p1, p0, Ll8/a$a;->q:Lv8/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 1

    iget-object p0, p0, Ll8/a$a;->q:Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method
