.class public abstract Lb6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Map;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lb6/c;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Lb6/c;-><init>(I)V

    sput-object v0, Lb6/b;->a:Ljava/util/Map;

    new-instance v0, Lb6/c;

    invoke-direct {v0, v1}, Lb6/c;-><init>(I)V

    sput-object v0, Lb6/b;->b:Ljava/util/Map;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/Class;
    .registers 3

    sget-object v0, Lb6/b;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    if-nez v1, :cond_16

    :try_start_a
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_11
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_a .. :try_end_11} :catch_12

    return-object v1

    :catch_12
    move-exception p0

    invoke-static {p0}, Lb6/e;->a(Ljava/lang/Exception;)V

    :cond_16
    return-object v1
.end method
