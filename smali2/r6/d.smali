.class public final synthetic Lr6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lr6/g;


# direct methods
.method public synthetic constructor <init>(Lr6/g;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/d;->q:Lr6/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lr6/d;->q:Lr6/g;

    invoke-static {p0}, Lr6/g;->X(Lr6/g;)V

    return-void
.end method
