.class public final Ly7/g$j$a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/g$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/t;


# direct methods
.method constructor <init>(LH8/t;)V
    .registers 2

    iput-object p1, p0, Ly7/g$j$a;->a:LH8/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .registers 2

    iget-object p0, p0, Ly7/g$j$a;->a:LH8/t;

    invoke-static {p0}, Ly7/g$j;->u(LH8/t;)V

    return-void
.end method
