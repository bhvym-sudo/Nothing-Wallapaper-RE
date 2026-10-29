.class public final synthetic Lk6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lk6/e;


# direct methods
.method public synthetic constructor <init>(Lk6/e;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/d;->q:Lk6/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lk6/d;->q:Lk6/e;

    invoke-static {p0}, Lk6/e;->a(Lk6/e;)V

    return-void
.end method
