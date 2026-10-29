.class public final synthetic LQ7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/f;


# instance fields
.field public final synthetic a:LQ7/s;


# direct methods
.method public synthetic constructor <init>(LQ7/s;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/o;->a:LQ7/s;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Exception;)V
    .registers 2

    iget-object p0, p0, LQ7/o;->a:LQ7/s;

    invoke-static {p0, p1}, LQ7/s;->k(LQ7/s;Ljava/lang/Exception;)V

    return-void
.end method
